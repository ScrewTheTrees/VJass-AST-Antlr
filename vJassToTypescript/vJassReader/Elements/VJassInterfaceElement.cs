using Serilog;
using System.IO;

namespace vJassToTypescript
{
    public class VJassInterfaceElement : VJassElement
    {
        public const string StartWord = "interface";
        public const string EndWord = "endinterface";
        public string name;

        public VJassInterfaceElement(BinaryReader reader, string nameSpace)
        {
            name = ParseHelper.GetNextStatement(reader);
            this.nameSpace = ParseHelper.AddNamespace(nameSpace, name);
            Log.Debug("Found interface with name: {name}", name);
            Log.Debug("Declare namespace: {nameSpace}", this.nameSpace);
            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var assembler = ParseHelper.GetNextStatement(reader);
                if (assembler == EndWord) break;

                if (AttemptParseComment(reader, assembler)) continue;
                if (AttemptParseMethod(reader, assembler)) continue;
            }

            Log.Debug("End interface: {name}", this.name);
        }

        public bool AttemptParseMethod(BinaryReader reader, string assembly)
        {
            switch (assembly)
            {
                case "method":
                    this.elements.Add(new VJassInterfaceMethodElement(reader, nameSpace));
                    break;
                default:
                    Log.Warning("Unknown codeword: " + assembly);
                    return false;
            }
            return false;
        }

        public override void WriteLua(StreamWriter writer, int indentation)
        {
            var indent = ParseHelper.MakeIndentation(indentation);
            writer.Write(indent + name + " = {}\n");

            WriteAllElementsLua(writer, indentation + 1);
        }

        public override void WriteTypescript(StreamWriter writer, int indentation)
        {
            var indent = ParseHelper.MakeIndentation(indentation);
            writer.Write(indent + "export interface " + name + " {\n");

            WriteAllElementsTypescript(writer, indentation + 1);

            writer.Write(indent + "}\n");
        }
    }
}
