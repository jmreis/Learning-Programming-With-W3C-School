/**
 * Classes1
 */
public class Classes1 {

    int x = 10;
    final int y = 100;      // Not changeble value

    String fname = "Jonh";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Classes1 myObj = new Classes1();
        myObj.x = 25;   // New attribute value
        System.out.println(myObj.x);


        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}