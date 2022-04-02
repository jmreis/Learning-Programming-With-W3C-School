/**
 * Classes15
 */

import java.util.ArrayList;

public class Classes15 {
    public static void main(String[] args) {
        ArrayList<String> cars =  new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(1));

        // cars.set(3, "Opel");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // for-each
        for (String i : cars) {
            System.out.println(i);
        }
    }
    
}