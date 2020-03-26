package lecture_8;

import lecture_8.lecture_8_1.Pet;

/**
 * Created by alpa on 3/26/20
 */
public class ToStringExample {

    public static void main(String[] args) {
        Pet cat = new Pet(1, "Garfild", "cat");
        System.out.println(cat);
        Pet dog = new Pet(2, "Bethoven", "dog");
        System.out.println(dog);

        System.out.println(cat.getClass().getName());
        System.out.println(dog.getClass().getSimpleName());


    }
}
