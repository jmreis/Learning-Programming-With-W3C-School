using System;

namespace MyApplication
{
    class Vehicle
    {
        public string brand = "Ford";
        public void honk()
        {
            Console.WriteLine("Tuut, tuut");
        }
    }

    class Car : Vehicle
    {
        public string modelName = "Mustang";
    }

    class Program
    {
        static void Main(string[] args)
        {
            Car mycar = new Car();
            mycar.honk();
            Console.WriteLine($"{mycar.brand} {mycar.modelname}");
        }
    }
}