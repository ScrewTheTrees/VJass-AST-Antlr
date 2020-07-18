using Serilog;
using System.IO;

namespace vJassToTypescript
{
    public class VJassLibraryElement : VJassElement
    {
        public const string StartWord = "library";
        public const string EndWord = "endlibrary";
        public string name;

        public VJassLibraryElement(BinaryReader reader, string nameSpace)
        {
            name = ParseHelper.GetNextStatement(reader);
            this.nameSpace = ParseHelper.AddNamespace(nameSpace, name);

            var nextStatement = ParseHelper.PeekNextStatement(reader);
            if (nextStatement == "requires" 
                || nextStatement == "needs" 
                || nextStatement == "uses")
            {

            }

            Log.Debug("Found library with name: {name}", name);
            Log.Debug("Declare namespace: {nameSpace}", this.nameSpace);
            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var assembler = ParseHelper.GetNextStatement(reader);
                if (assembler == EndWord) return;

                if (AttemptParseComment(reader, assembler)) continue;
                if (AttemptParseElement(reader, assembler)) continue;
            }
            Log.Debug("End library: {nameSpace}", this.nameSpace);
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
            writer.Write(indent + "export namespace " + name + " {\n");

            WriteAllElementsTypescript(writer, indentation + 1);

            writer.Write(indent + "}\n");
        }
    }
}
