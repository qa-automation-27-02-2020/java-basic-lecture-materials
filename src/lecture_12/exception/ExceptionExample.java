package lecture_12.exception;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * Created by alpa on 4/9/20
 */
public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Start program...");

//        String string = null;
//        System.out.println(string.isEmpty()); //NPE
//        int a = 10/0; //ArithmeticException
//        Integer integer = Integer.valueOf("sdfsf"); //NumberFormatException

//        String value = "sdfsfsfsdf";
        String value = "http://localhost:8080/users";
        URL url = null;
//        try {
//            url = new URL(value);
//            String host = url.getHost();
//            System.out.println("HOST: " + host);
//        } catch (MalformedURLException | NullPointerException e) {
//            if (e instanceof MalformedURLException) {
//                System.out.println("Wrong url value: " + value);
//            } else if (e instanceof NullPointerException) {
//                System.out.println("NPE");
//            } else {
//                e.printStackTrace();
//            }
//        }

        try {
            url = new URL(value);
            url = null;
            String host = url.getHost();
            System.out.println("HOST: " + host);
        } catch (Exception e) {
            if (e instanceof MalformedURLException) {
                System.out.println("Wrong url value: " + value);
            } else if (e instanceof NullPointerException) {
                System.out.println("NPE");
            } else {
                e.printStackTrace();
            }
        }


        System.out.println("Stop program...");
    }

    private static URL createUrl(String value) throws MalformedURLException {
        return new URL(value);
    }

}
