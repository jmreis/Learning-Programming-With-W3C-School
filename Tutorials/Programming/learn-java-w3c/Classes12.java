/**
 * Classes12
 */
import java.util.Scanner;

public class Classes12 {

    public static void main(String[] args) {
        Scanner myobj =  new Scanner(System.in);
        System.out.println("Enter name, age and salary:");

        String name = myobj.nextLine();

        int age = myobj.nextInt();
        double salary = myobj.nextDouble();

        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);

    }
}
