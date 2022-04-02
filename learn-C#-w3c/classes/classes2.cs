using System;

namespace MyApplication
{
    class Car
    {
        public string model;
        public string color;
        public int year;

        // Create constructor
        public Car(string modelname, string modelcolor, int modelyear)
        {
            model = modelname;
            color = modelcolor;
            year = modelyear;
        }

        static void Main(string[] args)
        {
            Car Ford = new Car("Mustang", "Red", 1969);
            Console.WriteLine($"{Ford.color} {Ford.year} {Ford.model}");
        }
    }
}