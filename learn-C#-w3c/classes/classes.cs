using System;

namespace MyApplication
{
    class Car
    {
        string color = "red";
        int maxspeed = 200;

        static void Main(string[] args)
        {
            Car myobj = new Car();
            Console.WriteLine(myobj.color);
            Console.WriteLine(myobj.maxspeed);
        }
    }
}