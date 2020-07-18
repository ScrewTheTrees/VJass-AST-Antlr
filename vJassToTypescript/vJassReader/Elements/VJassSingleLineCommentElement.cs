using Serilog;
using System.IO;


namespace vJassToTypescript
{
    public class VJassSingleLineCommentElement : VJassElement
    {
        public const string StartWord = "//";
        public const string EndWord = "\n";
        public string data;

        public VJassSingleLineCommentElement(BinaryReader reader, string nameSpace)
        {
            this.data = "";
            this.nameSpace = nameSpace;

            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var assembler = reader.ReadChar();
                this.data += assembler;

                if (data.EndsWith(EndWord)) return;
            }

            Log.Debug("Found Comment: " + data);
        }

        public override void WriteLua(StreamWriter writer, int indentation)
        {
            writer.Write(ParseHelper.MakeIndentation(indentation) + "--" + data);
        }

        public override void WriteTypescript(StreamWriter writer, int indentation)
        {
            writer.Write(ParseHelper.MakeIndentation(indentation) + "//" + data);
        }
    }
}
