using Serilog;
using System;
using System.IO;
using System.Text;

namespace vJassToTypescript
{
    class Program
    {
        static void Main(string[] args)
        {
            CreateLogging();

            var filename = args.Length > 0 ? args[0] : "";

            filename = Environment.CurrentDirectory + "\\TestLibs\\projectile.txt";

            if (File.Exists(filename))
            {
                Log.Debug(filename + " - Found");

                using var file = new BinaryReader(new FileStream(filename, FileMode.Open, FileAccess.Read));
                var vjass = new VJassReader(file);

                //using var newFile = new StreamWriter(new FileStream(filename.Replace(".j", "") + ".lua", FileMode.Create, FileAccess.Write), Encoding.UTF8);
                using var newFile2 = new StreamWriter(new FileStream(filename.Replace(".j", "") + ".ts", FileMode.Create, FileAccess.Write), Encoding.UTF8);
                //vjass.mainElement.WriteLua(newFile, 0);
                vjass.mainElement.WriteTypescript(newFile2, 0);
            }
            else
            {
                Log.Error(filename + " - Cannot be found.");
            }

        }

        static void CreateLogging()
        {
            try { System.IO.File.Delete("log.txt"); } catch { /* do nothing*/ }

            Log.Logger = new LoggerConfiguration()
                // .MinimumLevel.Debug()
                .MinimumLevel.Verbose()
                .WriteTo.Console()
                .WriteTo.File("log.txt")
                .CreateLogger();
        }
    }
}
