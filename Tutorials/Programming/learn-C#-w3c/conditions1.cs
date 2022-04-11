using System;

namespace MyApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            int time = 20;
            string result = (time < 18) ? "Goog day." : "Good evening.";
            Console.WriteLine(result);
        }
    }
}