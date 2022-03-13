/**
 * Classes5
 */
public class Classes5 {

    int modelYear;
    String modelName;

    public Classes5(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Classes5 myCar = new Classes5(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}