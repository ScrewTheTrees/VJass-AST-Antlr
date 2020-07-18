using Serilog;
using System;
using System.IO;
using vJassToTypescript.Enums;
using vJassToTypescript.Enums.Elements;

namespace vJassToTypescript
{
    public class VJassGlobalsElement : VJassElement
    {
        public const string StartWord = "globals";
        public const string EndWord = "endglobals";

        public VJassGlobalsElement(BinaryReader reader, string nameSpace)
        {
            this.nameSpace = nameSpace;
            Log.Debug("Found globals in namespace: {nameSpace}", this.nameSpace);
            var isConstant = false;

            while (reader.BaseStream.Position < reader.BaseStream.Length)
            {
                var assembler = ParseHelper.GetNextStatement(reader);
                if (assembler == EndWord) break;

                if (AttemptParseComment(reader, assembler)) continue;


                if (AttemptParseScope(assembler)) { continue; }
                if (assembler == "constant")
                {
                    isConstant = true;
                    continue;
                }

                var type = assembler;
                var varName = ParseHelper.GetNextStatement(reader);
                var value = ParseHelper.GetNextVariableValue(reader).Trim();
                Log.Debug("Found {scopeName} variable: {varName} of type: {type} with value: {value} and isConstant? {isConstant}",
                    Enum.GetName(typeof(VJassScope), scope), varName, type, value, isConstant);

                var element = new VJassValueElement(this.scope, type, varName, value)
                {
                    nameSpace = nameSpace,
                    isConstant = isConstant,
                };
                this.elements.Add(element);

                //TODO: Make Variable definition
                this.scope = VJassScope.NONE;
                isConstant = false;
            }
            Log.Debug("End Globals Block");
        }

        public override void WriteLua(StreamWriter writer, int indentation)
        {
            WriteAllElementsLua(writer, indentation + 1);
        }

        public override void WriteTypescript(StreamWriter writer, int indentation)
        {
            writer.Write(ParseHelper.MakeIndentation(indentation) + "// Start Globals \n");
            WriteAllElementsTypescript(writer, indentation + 1);
            writer.Write(ParseHelper.MakeIndentation(indentation) + "// End Globals \n");
        }
    }
}
