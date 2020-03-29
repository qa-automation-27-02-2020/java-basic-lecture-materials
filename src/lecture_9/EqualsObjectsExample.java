package lecture_9;

import lecture_8.lecture_8_1.Pet;
import lecture_8.lecture_8_1.User;

/**
 * Created by alpa on 3/29/20
 */
public class EqualsObjectsExample {

    public static void main(String[] args) {
        Pet hamster = new Pet(1, "Bob", "hamster");
        hamster.setVisitDate("20/10/2020");
        System.out.println(hamster.toString());
        Pet hamster1 = new Pet(1, "Bob", "hamster");
        System.out.println(hamster1.toString());

        System.out.println(hamster.equals(hamster1));
        if (hamster.equals(hamster1)) {
            System.out.println("Objects are equal!");
        }

    }
}
