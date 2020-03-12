package lecture_2.lecture_3;

/**
 * Created by alpa on 3/5/20
 */
public class IfElseExample {

    public static void main(String[] args) {
        int age = 10;

//        if (age >= 18) {
//            System.out.println("You have access to resource!");
//        } else {
//            System.out.println("You have access for test resource!");
//        }

        if (age >= 18) {
            System.out.println("You have access to resource!");
        } else if (age < 18 && age >= 16) {
            System.out.println("You have access for teenager resource!");
        } else if (age == 15 || age == 30) {
            System.out.println("You are the winner!");
        } else if (age != 25) {
            System.out.println("Not lucky boy or girl!");
        }

        System.out.println("Login to site");

    }
}
