using System;

namespace MyApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            double myDouble = 9.78;
            // Manual casting
            int myInt = (int) myDouble;

            Console.WriteLine(myDouble);
            Console.WriteLine(myInt);
        }
    }
}