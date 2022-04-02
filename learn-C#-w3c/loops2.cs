using System;

namespace MyApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] cars = {"Volvo", "BMW", "Ford"};
            Console.WriteLine(cars[0]);
            cars[0] = "Opel";
            Console.WriteLine(cars[0]);
            Console.WriteLine(cars.Length);

            for (int i = 0; i < cars.Length; i++)
            {
                Console.WriteLine(cars[i]);
            }

        }
    }
}