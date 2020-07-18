using System.IO;
using System.Runtime.InteropServices.ComTypes;
using System.Xml;

namespace vJassToTypescript
{
    public class ParseHelper
    {
        public static bool IsStatementChar(char theChar)
        {
            return (char.IsLetterOrDigit(theChar)
                || theChar == '_'
                || theChar == '.'
                );
        }


        public static string PeekNextStatement(BinaryReader reader)
        {
            var pos = reader.BaseStream.Position;
            var statement = GetNextStatement(reader);
            reader.BaseStream.Position = pos;
            return statement;
        }

        public static string GetNextStatement(BinaryReader reader)
        {
            var assembly = "";
            var commentStatement = "";
            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var nextChar = reader.ReadChar();

                //Handle words
                if (IsStatementChar(nextChar))
                {
                    assembly += nextChar;
                }

                else if (assembly.Length > 0)
                {
                    reader.BaseStream.Position -= 1;
                    return assembly;
                }

                //Handle comments
                if (nextChar == '/'
                    || nextChar == '*'
                    )
                {
                    commentStatement += nextChar;
                }
                else commentStatement = "";

                if (commentStatement.Length >= 2)
                {
                    return commentStatement;
                }
            }
            return assembly;
        }

        public static string GetNextVariableValue(BinaryReader reader)
        {
            var assembly = "";
            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var next = reader.ReadChar();
                if (next == '\n') break;
                if (next == '=')
                {
                    return ParseVariableValues(reader);
                }
            }

            return assembly;
        }

        private static string ParseVariableValues(BinaryReader reader)
        {
            var assembly = "";
            bool inString = false;
            char previous = ' ';

            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var next = reader.ReadChar();
                if (next == '\n') { reader.BaseStream.Position -= 1; reader.BaseStream.Position -= 1; return assembly; }
                if (next == '/' && !inString) { reader.BaseStream.Position -= 1; return assembly; }
                if (next == '\"') inString = !inString;

                if (char.IsWhiteSpace(next) && char.IsWhiteSpace(previous) && !inString) continue; // Skip

                assembly += next;

                previous = next;
            }
            return assembly;
        }

        public static string MakeIndentation(int indentation)
        {
            var assem = "";
            for (var i = 0; i < indentation; i++)
            {
                assem += "    ";
            }
            return assem;
        }

        public static bool IsNextEquals(BinaryReader reader)
        {
            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {

            }
            return false;
        }

        public static string AddNamespace(string original, string toAdd)
        {
            if (original.Length > 0) original += ".";

            original += toAdd;

            return original;
        }


        public static string ConvertVariableTypes(string text)
        {
            switch (text)
            {
                case "integer":
                case "real":
                    return "number";
                case "nothing":
                    return "void";
            }

            return text;
        }

    }
}
