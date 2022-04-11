/**
 * Classes2
 */
public class Classes2 {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static method can be called without creating a new object.");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creting objects");
    }

    public static void main(String[] args) {
        myStaticMethod();   // Call the static method
        // myPublicMethod(); Generate Error

        // Create a object
        Classes2 myObj = new Classes2();
        // Call the public method
        myObj.myPublicMethod();
    }
}