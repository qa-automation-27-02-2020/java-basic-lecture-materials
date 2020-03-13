package lecrture_4;

/**
 * Created by alpa on 3/12/20
 */
public class ArrayExample {

    public static void main(String[] args) {

        int[] emptyNumber = {};
        System.out.println(emptyNumber.length);

        int[] numbers = {1,2,3,4};
        System.out.println(numbers.length);
        System.out.println(numbers[3]);
        System.out.println(numbers[2]);

        String[] names = {"Ivan", "John", "Anna"};
        System.out.println(names[0]);
    }
}
