namespace vJassToTypescript
{
    public class VJassMethodArgument
    {
        public string argumentType;
        public string argumentName;

        public VJassMethodArgument(string type, string name)
        {
            this.argumentType = ParseHelper.ConvertVariableTypes(type);
            this.argumentName = name;
        }
    }



}
