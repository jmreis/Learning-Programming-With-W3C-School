using System;

namespace MyApplication
{
    class Person
    {
        private string name;
        public string Name
        {
            get { return name; }
            set { name = value; }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Person myobj = new Person();
            myobj.Name = "Liam";
            Console.WriteLine(myobj.Name);
        }
    }
}