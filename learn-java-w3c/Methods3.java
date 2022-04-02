/**
 * Methods3
 */
public class Methods3 {

    static void checkAge(int age) {
        
        if (age < 18) {
            System.out.println("Access denied.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        checkAge(20); // Call the method
    }
}