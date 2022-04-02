/**
 * Classes17
 */
import java.security.DrbgParameters.Capability;
import java.util.HashMap;

public class Classes17 {
    public static void main(String[] args) {
        // Create a hashmap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add key and values (country, city)
        capitalCities.put("England", "London");
        capitalCities.put("Germny", "Berlin");
        capitalCities.put("USA", "Wasshington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.size());

        // Loop
        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + "Values: " + capitalCities.get(i));
        }
    }   
}