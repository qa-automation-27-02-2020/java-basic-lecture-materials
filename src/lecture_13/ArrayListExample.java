package lecture_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by alpa on 4/12/20
 */
public class ArrayListExample {

    public static void main(String[] args) {
//        String[] array = new String[9];
//
//        for (int i = 0; i < 10; i++) {
//            array[i] = String.valueOf(i);
//        }

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Alex");
        arrayList.add("Bob");
        arrayList.add("Anna");
        arrayList.add("John");
        arrayList.add("Vasiliy");
        arrayList.add("Bob");

        System.out.println(arrayList);

//        System.out.println(arrayList.get(0)); //array[i];
//        System.out.println(arrayList.get(3)); //array[i];
//        System.out.println(arrayList.get(4)); //array[i];

        System.out.println("remove: " + arrayList.removeAll(Arrays.asList("Bob")));
        System.out.println("remove: " + arrayList.remove(2));

//        [0, 1, 2, 3, 4]
//        [0, 1, 3, 4]

        System.out.println(arrayList);

        int size = arrayList.size();
        System.out.println(size);

        System.out.println("contains: " +  arrayList.contains("Alex"));
        System.out.println("contains: " +  arrayList.contains("Kate"));

        for (String value : arrayList) {
            System.out.println(value);
        }

//        arrayList.forEach(System.out::println);

        arrayList.forEach(value -> {
            System.out.println(value);
        });




    }
}
