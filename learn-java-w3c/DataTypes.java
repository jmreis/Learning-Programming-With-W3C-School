public class DataTypes {

    public static void main(String[] args) {
        double myDouble = 9.78d;
        // Manual casting: double to int
        int myInt = (int) myDouble;
        System.out.println(myInt);

        // Automatic casting: int to double
        int myNewInt = 9;
        double myNewDouble = myNewInt;
        System.out.println(myNewDouble);

    }
}