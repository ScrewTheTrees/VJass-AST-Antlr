using Serilog;
using System.Collections.Generic;
using System.IO;
using vJassToTypescript.Enums;

namespace vJassToTypescript
{
    public class VJassInterfaceMethodElement : VJassElement
    {
        public string name;
        public List<VJassMethodArgument> arguments = new List<VJassMethodArgument>();
        public VJassMethodArgument returnValue;
        public VJassMethodArgument defaultValue;

        public VJassInterfaceMethodElement(BinaryReader reader, string nameSpace)
        {
            this.nameSpace = nameSpace;

            this.name = ParseHelper.GetNextStatement(reader);

            VJassMethodState state = VJassMethodState.NONE;

            Log.Debug("Found method named: {name}", name);

            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var assembly = ParseHelper.GetNextStatement(reader);

                if (assembly == "takes") { state = VJassMethodState.TAKES; continue; }
                if (assembly == "returns") { state = VJassMethodState.RETURNS; continue; }

                if (state == VJassMethodState.TAKES)
                {
                    if (assembly == "nothing") { continue; }

                    var type = assembly;
                    var name = ParseHelper.GetNextStatement(reader);
                    arguments.Add(new VJassMethodArgument(type, name));
                    Log.Debug("    - Found argument named: {name} of type {type}", name, type);
                    continue;
                }
                if (state == VJassMethodState.RETURNS)
                {
                    var type = assembly;

                    returnValue = new VJassMethodArgument(type, type);
                    Log.Debug("    - Found return value of type {type}", type);

                    if (ParseHelper.PeekNextStatement(reader) == "defaults")
                    {
                        assembly = ParseHelper.GetNextStatement(reader);
                        type = ParseHelper.GetNextStatement(reader);
                        defaultValue = new VJassMethodArgument(type, type);
                        Log.Debug("    - (Disregarded) Found default value of type {type}", type);
                    }
                    break; //We're done
                }
            }
        }

        public override void WriteLua(StreamWriter writer, int indentation)
        {
            this.WriteAllElementsLua(writer, indentation);
        }

        public override void WriteTypescript(StreamWriter writer, int indentation)
        {
            var first = true;
            writer.Write(ParseHelper.MakeIndentation(indentation) + this.name + "(");
            foreach (var argument in arguments)
            {
                if (!first) writer.Write(", ");
                writer.Write(argument.argumentName + ": " + argument.argumentType);

                first = false;
            }
            writer.Write("): " + this.returnValue.argumentType + ";\n");
        }

    }



}
