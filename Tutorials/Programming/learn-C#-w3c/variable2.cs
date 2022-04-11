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
            // Declaring many varibles
            int x = 5, y = 6, z = 50;
            Console.WriteLine(x + y + z);

            Console.WriteLine(myDouble);
            Console.WriteLine(myInt);
        }
    }
}