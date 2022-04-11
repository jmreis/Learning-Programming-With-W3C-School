import java.util.HashSet;

/**
 * Classes18
 */

 import java.util.HashSet;

public class Classes18 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("BMW");
        System.out.println(cars);
        System.out.println(cars.contains("BMW"));
    }
}