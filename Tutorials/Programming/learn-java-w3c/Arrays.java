/**
 * Arrays
 */
public class Arrays {

    public static void main(String[] args) {
        String[] cars = {"volvo", "bmw", "ford", "mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[1]);
        System.out.println(myNum[0]);
        System.out.println(cars.length);
        System.out.println(myNum.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (int i : myNum) {
            System.out.println(i);
        }
    }
}