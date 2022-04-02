using System;

namespace MyApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(i);
            }

            string[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            // foreach loop
            foreach (string i in cars)
            {
                Console.WriteLine(i);
            }
        }
    }
}