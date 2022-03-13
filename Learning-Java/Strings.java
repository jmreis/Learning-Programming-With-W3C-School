/**
 * Strings
 */
public class Strings {

    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "John";

        // Using length
        System.out.println(greeting.length());
        // More methods
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.indexOf("ll"));
        System.out.println(greeting + " " + name);
        System.out.println(greeting.concat(name));

    }
}