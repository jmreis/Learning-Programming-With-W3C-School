/**
 * Classes20
 */
public class Classes20 {

    public static void main(String[] args) {
        try {
            int[] mynumbers = {1, 2, 3};
            System.out.println(mynumbers[10]);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}