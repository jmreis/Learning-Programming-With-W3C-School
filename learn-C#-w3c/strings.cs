using System;

namespace MyApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            string greeting = "Hello";
            Console.WriteLine(greeting.ToUpper());
            Console.WriteLine(greeting.ToLower());

            string firstname = "John";
            string lastname = "Wike";
            string name = firstname + lastname;
            Console.WriteLine(name);
            Console.WriteLine(string.Concat(firstname, lastname));
            Console.WriteLine($"My full name is: {firstname} {lastname}");




        }
    }
}