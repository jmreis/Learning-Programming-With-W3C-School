/**
 * Classes19
 */

 import java.util.ArrayList;
 import java.util.Iterator;

public class Classes19 {
    public static void main(String[] args) {
        
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        // loop
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}