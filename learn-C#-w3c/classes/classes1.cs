using System;

namespace MyApplication
{
    class Car
    {
        public string model;    // create a field

        public Car()
        {
            model = "Mustang";  // set the initial value
        }

        static void Main(string[] args)
        {
            Car Ford = new Car();
            Console.WriteLine(Ford.model);
        }
    }
}