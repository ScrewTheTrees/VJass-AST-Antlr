using Serilog;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.ComTypes;
using vJassToTypescript.Enums;

namespace vJassToTypescript
{
    public abstract class VJassElement
    {
        public List<VJassElement> elements = new List<VJassElement>();

        public VJassScope scope = VJassScope.NONE;
        public string nameSpace = "";

        public bool AttemptParseElement(BinaryReader reader, string assembly)
        {
            switch (assembly)
            {
                case VJassLibraryElement.StartWord:
                    elements.Add(new VJassLibraryElement(reader, nameSpace));
                    return true;
                case VJassGlobalsElement.StartWord:
                    elements.Add(new VJassGlobalsElement(reader, nameSpace));
                    return true;
                case VJassInterfaceElement.StartWord:
                    elements.Add(new VJassInterfaceElement(reader, nameSpace));
                    return true;

                case VJassFunctionElement.StartWord:
                    elements.Add(new VJassFunctionElement(reader, nameSpace));
                    return true;

                default:
                    Log.Warning("Unknown codeword: {assembly}", assembly);
                    return false;
            }
        }

        public bool AttemptParseComment(BinaryReader reader, string assembly)
        {
            switch (assembly)
            {
                case VJassSingleLineCommentElement.StartWord:
                    elements.Add(new VJassSingleLineCommentElement(reader, nameSpace));
                    return true;
                case VJassMultiLineCommentElement.StartWord:
                    elements.Add(new VJassMultiLineCommentElement(reader, nameSpace));
                    return true;

                default:
                    return false;
            }
        }

        public bool AttemptParseFunction(BinaryReader reader, string assembly)
        {
            switch (assembly)
            {

                default:
                    Log.Warning("Unknown statement: {assembly}", assembly);
                    return false;
            }
        }

        public bool AttemptParseScope(string assembly)
        {
            switch (assembly)
            {
                case "public":
                    this.scope = VJassScope.PUBLIC;
                    return true;

                case "private":
                    this.scope = VJassScope.PRIVATE;
                    return true;
            }

            return false;
        }

        public bool AttemptParseVariable(string assembly)
        {
            if (VJassTypes.Types.Contains(assembly)) return true;

            return false;
        }

        public abstract void WriteLua(StreamWriter writer, int indentation);
        public abstract void WriteTypescript(StreamWriter writer, int indentation);

        protected void WriteAllElementsLua(StreamWriter writer, int indentation)
        {
            foreach (var element in this.elements)
            {
                element.WriteLua(writer, indentation);
            }
        }
        protected void WriteAllElementsTypescript(StreamWriter writer, int indentation)
        {
            foreach (var element in this.elements)
            {
                element.WriteTypescript(writer, indentation);
            }
        }


        protected string GetNamespace()
        {
            if (nameSpace.Length > 0) return nameSpace + ".";
            return "";
        }
    }
}
