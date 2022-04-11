using System;

namespace MyApplication
{
    class Program
    {
        static void Main(String[] args)
        {
            // Msg for user
            Console.WriteLine("Enter username: ");
            // Create a string variable and get user input
            string userName = Console.ReadLine();
            // Print the value
            Console.WriteLine("Username is: " + userName);

            // Input numbers
            Console.WriteLine("Enter your age:");
            int age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Your age is: " + age);
        }
        
    }
}