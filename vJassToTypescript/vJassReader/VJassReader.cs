using System.IO;
using vJassToTypescript;

namespace vJassToTypescript
{
    public class VJassReader
    {
        public VJassBaseElement mainElement;

        public VJassReader(BinaryReader reader)
        {
            this.mainElement = new VJassBaseElement(reader, "");
        }
    }
}
