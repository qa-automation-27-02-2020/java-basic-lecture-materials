package lecrture_4;

import java.util.Objects;

/**
 * Created by alpa on 3/12/20
 */
public class ForLoopsExample {

    public static void main(String[] args) {
        String[] names = {"Ivan", "John", "Anna", "Piter"};
//        if (Objects.nonNull(names) && names.length != 0) {
//            System.out.println(names[0]);
//            System.out.println(names[1]);
//            System.out.println(names[2]);
//        }

        for (int i = 0; names.length > i; i++) {
            System.out.println("i = " + i);
            System.out.println(names[i]);
        }

        for (int i = names.length; i > 0; i--) {
            System.out.println("i = " + i);
            System.out.println(names[i-1]);
        }
    }
}
