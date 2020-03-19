package lecture_6;

/**
 * Created by alpa on 3/19/20
 */
public class StringConcatExample {

    public static void main(String[] args) {

        String userName = "Ivan";
        String userLastName = "Ivanov";

        long start = System.nanoTime();
        System.out.println("User: " + userName + " " +  userLastName);
        long stop = System.nanoTime();
        System.out.println(stop - start);

        start = System.nanoTime();
        System.out.println("User: ".concat(userName.concat(" ").concat(userLastName)));
        stop = System.nanoTime();
        System.out.println(stop - start);

//        char[] chars = {'u','s','e', 'r'};
//        String s = new String(chars);
//        System.out.println(s);
    }
}
