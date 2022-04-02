using System;

namespace MyApplication
{
    class Program
    {
        static void mymethod()
        {
            Console.WriteLine("I just got executed!");
        }

        static void myname(string name)
        {
            Console.WriteLine(name + " Refsnes");
        }

        static void mycountry(string country = "USA")
        {
            Console.WriteLine(country);
        }

        static void mynameage(string name, int age)
        {
            Console.WriteLine($"{name} is {age}");
        }

        static void sumfive(int x)
        {
            return 5 + x;
        }

        static void mychild(string child1, string child2, string child3)
        {
            Console.WriteLine(child3);
        }

        static void Main(string[] args)
        {
            mymethod();
            myname("Test");
            mycountry("Brazil");
            mycountry();
            mynameage("John", 43);
            sumfive(5);
            mychild(child1: "Jonh", child2: "Tor", child3: "C#");
        }
    }
}