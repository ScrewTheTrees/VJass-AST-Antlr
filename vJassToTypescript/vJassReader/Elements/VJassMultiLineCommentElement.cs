using Serilog;
using System.IO;


namespace vJassToTypescript
{
    public class VJassMultiLineCommentElement : VJassElement
    {
        public const string StartWord = "/*";
        public const string EndWord = "*/";
        public string data;

        public VJassMultiLineCommentElement(BinaryReader reader, string nameSpace)
        {
            this.data = "";
            this.nameSpace = nameSpace;

            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var assembler = reader.ReadChar();
                this.data += assembler;
                if (data.EndsWith(EndWord)) return;
            }

            Log.Debug("Found Multi Line Comment: " + data);
        }

        public override void WriteLua(StreamWriter writer, int indentation)
        {
            var newData = data.Replace("\n", "\n"+ ParseHelper.MakeIndentation(indentation) + "--").Replace(EndWord, "");
            writer.Write(ParseHelper.MakeIndentation(indentation) + "--" + newData);
        }

        public override void WriteTypescript(StreamWriter writer, int indentation)
        {
            var newData = data.Replace("\n", "\n" + ParseHelper.MakeIndentation(indentation));
            writer.Write(ParseHelper.MakeIndentation(indentation) + "/*" + newData);
        }
    }
}
