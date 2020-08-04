using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Serilog;
using System;
using System.Diagnostics;
using System.IO;

namespace vJassToTypescript
{
    class Program
    {
        static void Main(string[] args)
        {
            CreateLogging();

            var filename = args.Length > 0 ? args[0] : "";
            var outputFile = args.Length > 1 ? args[1] : "";

            filename = Environment.CurrentDirectory + "\\TestLibs\\projectile.txt";
            AstGenerate(filename);

            filename = Environment.CurrentDirectory + "\\TestLibs\\illusion.txt";
            AstGenerate(filename);

            filename = Environment.CurrentDirectory + "\\TestLibs\\Missile.txt";
            AstGenerate(filename);

        }

        private static void AstGenerate(string filename, string outFile = "")
        {
            if (File.Exists(filename))
            {
                Log.Debug(filename + " - Found");

                var file = new AntlrFileStream(filename);
                var lexer = new VJassLexer(file);
                var commonTokenStream = new CommonTokenStream(lexer);
                var parser = new VJassParser(commonTokenStream);
                var context = parser.program();
                //TraverseNode(context);


                Debug.Write(context);
            }
            else
            {
                Log.Error(filename + " - Cannot be found.");
            }
        }

        private static void TraverseNode(IParseTree context, int indentation = 0)
        {
            if (context.ChildCount > 0)
            {
                Log.Debug("{indentation} ---{type}---", MakeIndentation(indentation), context.GetType());
                for (int i = 0; i < context.ChildCount; i++)
                {
                    IParseTree node = context.GetChild(i);
                    TraverseNode(node, indentation + 1);
                }
                Log.Debug("{indentation} ---", MakeIndentation(indentation));
            }
            else
            {
                Log.Debug("{indentation} >Found Section: {text}", MakeIndentation(indentation), context.GetText());
            }
        }

        private static string MakeIndentation(int indentation)
        {
            string retvar = "";
            for (int i = 0; i < indentation; i++)
            {
                retvar += "    ";
            }
            return retvar;
        }

        static void CreateLogging()
        {
            try { File.Delete("log.txt"); } catch { /* do nothing*/ }

            Log.Logger = new LoggerConfiguration()
                // .MinimumLevel.Debug()
                .MinimumLevel.Verbose()
                .WriteTo.Console()
                .WriteTo.File("log.txt")
                .CreateLogger();
        }
    }
}
