package lecture_8;

import lecture_8.lecture_8_1.Pet;

/**
 * Created by alpa on 3/26/20
 */
public class PetExample {

    public static void main(String[] args) {
        Pet cat = new Pet(1, "Garfild", "cat");
        System.out.println(cat.getId());
        System.out.println(cat.getName());
        System.out.println(cat.getType());
        System.out.println(cat.getVisitDate());

        cat.setVisitDate("20/03/2020");
        System.out.println(cat.getVisitDate());

    }
}
