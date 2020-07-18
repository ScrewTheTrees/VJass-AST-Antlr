using Serilog;
using System.Collections.Generic;
using System.IO;
using vJassToTypescript.Enums;

namespace vJassToTypescript
{
    public class VJassFunctionElement : VJassElement
    {
        public const string StartWord = "function";
        public const string EndWord = "endfunction";

        public string name;
        public List<VJassMethodArgument> arguments = new List<VJassMethodArgument>();
        public VJassMethodArgument returnValue;
        public VJassMethodArgument defaultValue;

        public VJassFunctionElement(BinaryReader reader, string nameSpace)
        {
            this.nameSpace = nameSpace;

            this.name = ParseHelper.GetNextStatement(reader);

            VJassMethodState state = VJassMethodState.NONE;

            Log.Debug("Found function named: {name}", name);

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
                    break; //We're done
                }
            }
            //Iterate Function
            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var assembly = ParseHelper.GetNextStatement(reader);

                if (assembly == EndWord) break;
                if (AttemptParseComment(reader, assembly)) continue;
                if (AttemptParseFunction(reader, assembly)) continue;

            }

            Log.Debug("End function: {name}", name);
        }

        public override void WriteLua(StreamWriter writer, int indentation)
        {
            this.WriteAllElementsLua(writer, indentation);
        }

        public override void WriteTypescript(StreamWriter writer, int indentation)
        {
            var first = true;
            writer.Write(ParseHelper.MakeIndentation(indentation) + "export " + this.name + "(");
            foreach (var argument in arguments)
            {
                if (!first) writer.Write(", ");
                writer.Write(argument.argumentName + ": " + argument.argumentType);

                first = false;
            }
            writer.Write("): " + this.returnValue.argumentType + " {\n");
            WriteAllElementsTypescript(writer, indentation + 1);
            writer.Write(ParseHelper.MakeIndentation(indentation) + "}\n");
        }

    }


}
