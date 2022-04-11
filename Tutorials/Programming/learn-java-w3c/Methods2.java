/**
 * Methods2
 */
public class Methods2 {

    static int myMethod(int x) {
        return 5 + x;
    }

    static int mySum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(mySum(10, 120));

        // Using variables
        int z = mySum(1234, 4321);
        System.out.println(z);
    }
}