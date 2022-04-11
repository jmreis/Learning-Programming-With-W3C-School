/**
 * Classes7
 */
public class Classes7 {

    class Vehicle {
        protected String brand = "Ford";

        public void honk() {
            System.out.println("Tuut, tuuut!");
        }
    }

    class Car extends Vehicle {
        private String modelName = "Mustang";   // Car Attribute
        public static void main(String[] args) {
            
            // Create a myCar object
            Car myCar = new Car();
            // Call the honk
            myCar.honk();

            // Using Vehicle attributes
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }
}