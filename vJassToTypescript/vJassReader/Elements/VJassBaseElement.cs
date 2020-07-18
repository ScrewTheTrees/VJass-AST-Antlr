using System.IO;

namespace vJassToTypescript
{
    public class VJassBaseElement : VJassElement
    {
        public VJassBaseElement(BinaryReader reader, string nameSpace)
        {
            this.nameSpace = nameSpace;
            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var assembly = ParseHelper.GetNextStatement(reader);

                if (AttemptParseComment(reader, assembly)) continue;
                if (AttemptParseElement(reader, assembly)) continue;
            }
        }

        public override void WriteLua(StreamWriter writer, int indentation)
        {
            this.WriteAllElementsLua(writer, indentation);
        }

        public override void WriteTypescript(StreamWriter writer, int indentation)
        {
            this.WriteAllElementsTypescript(writer, indentation);
        }
    }
}
