using System;
using System.IO;
using System.Text.RegularExpressions;

namespace vJassToTypescript.Enums.Elements
{
    public class VJassValueElement : VJassElement
    {
        public string variableType;
        public string variableName;
        public string variableValue;
        public bool isConstant = false;

        public VJassValueElement(VJassScope scope, string variableType, string variableName, string variableValue)
        {
            this.scope = scope;
            this.variableType = ParseHelper.ConvertVariableTypes(variableType);
            this.variableName = variableName;
            this.variableValue = variableValue;
            

            if (this.variableType == "number")
            {
                Regex regex = new Regex(@"\'....\'");
                Match match = regex.Match(variableValue);
                if (match.Success)
                {
                    foreach (var value in match.Groups.Values)
                    {
                        this.variableValue = variableValue.Replace(value.Value, "FourCC(\"" + value.Value.Substring(1, 4) + "\")");
                    }
                }
            }

            this.variableValue = this.variableValue.Trim();

        }
        public override void WriteLua(StreamWriter writer, int indentation)
        {
            throw new NotImplementedException();
            if (GetNamespace().Length == 0) writer.Write("var ");
            writer.WriteLine(ParseHelper.MakeIndentation(indentation) + GetNamespace() + variableName + " = " + variableValue);
        }

        public override void WriteTypescript(StreamWriter writer, int indentation)
        {
            writer.Write(ParseHelper.MakeIndentation(indentation));
            if (scope == VJassScope.PUBLIC) writer.Write("export ");
            if (isConstant) writer.Write("const ");
            else writer.Write("let ");
            writer.Write(variableName + ": " + variableType);
            if (variableValue.Length > 0) writer.Write(" = " + variableValue);
            writer.Write(";\n");
        }
    }
}
