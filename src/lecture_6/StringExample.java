package lecture_6;

/**
 * Created by alpa on 3/19/20
 */
public class StringExample {

    public static void main(String[] args) {
//        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
//        for (char c : charArray) {
//            System.out.print(c);
//        }

        String helloString = "hello";
        String helloString2 = "hello";
        System.out.println(helloString == helloString2);

        String stringObj = new String("hello");
        System.out.println(stringObj.equals(helloString));

    }

}
