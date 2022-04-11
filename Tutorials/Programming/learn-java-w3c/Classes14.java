/**
 * Classes14
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Classes14 {
    public static void main(String[] args) {
        LocalDateTime mydateobj = LocalDateTime.now();
        System.out.println("Before formating: " + mydateobj);
        DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatteddate = mydateobj.format(myformatobj);
        System.out.println("After formatting: " + formatteddate);
    }
    
}