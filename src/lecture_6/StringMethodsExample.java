package lecture_6;

import java.util.Objects;

/**
 * Created by alpa on 3/19/20
 */
public class StringMethodsExample {

    public static void main(String[] args) {
//        String userName = "ApanashchEnkO";

//        if (userName.toLowerCase().equals("APANASHCHENKO")) {
//            System.out.println("Test passed");
//        } else {
//            System.out.println("Test failed");
//        }

//        if (userName.equalsIgnoreCase("APANASHCHENKO")) {
//            System.out.println("Test passed");
//        } else {
//            System.out.println("Test failed");
//        }

//        String email = " cooluser@gmail.com ";
//        if (email.contains("@gmail.ua")) {
//            System.out.println("Correct email");
//        } else {
//            System.out.println("Wrong email");
//        }
//
//        int length = email.length();
//        System.out.println(length);

//        String user = "      user1 ";
//        String expectedUser = "user1";
//
//        if (user.trim().equalsIgnoreCase(expectedUser)) {
//            System.out.println("Correct user");
//        } else {
//            System.out.println("Wrong user");
//        }

//        String welcomeMessage =  "Dear, Alexey.... bye";
//        if (welcomeMessage.startsWith("Dear")) {
//            System.out.println("test passed");
//        }
//
//        if (welcomeMessage.startsWith(",", 4)) {
//            System.out.println("correct comma");
//        }
//
//        if (welcomeMessage.endsWith("bye")) {
//            System.out.println("correct finish");
//        }


//        String email = "cooluser@gmail.com";
//
//        String replaceEmail = email.replace("@gmail.com", "-username");
//        System.out.println(email);
//        System.out.println(replaceEmail);

//        String username = "user12121";
//        String replace = username.replace("1", "-")
//                .replace("2", "-");
//        System.out.println(replace);
//        String replaceAll = username.replaceAll("[0-9]", "-");
//        System.out.println(replaceAll);
//        System.out.println(replace.equals(replaceAll));

//        String welcomeMessage = "Hello, students!";
//        char c = welcomeMessage.charAt(7);
//        System.out.println(c);

//        char[] chars = welcomeMessage.toCharArray();
//        for (char letter : chars) {
//            System.out.println(letter);
//        }

//        String[] split = welcomeMessage.split(",");
//        System.out.println(split.length);
//        System.out.println(split[0]);
//        System.out.println(split[1].trim());

//        String emptyString = null;
//        if (!Objects.isNull(emptyString) && emptyString.trim().isEmpty()){
//            System.out.println("Empty string");
//        }

         String welcomeMessage = "Hello, students!";

        String substring = welcomeMessage.substring(5);
        System.out.println(substring);

        String substring2 = welcomeMessage.substring(0, 5);
        System.out.println(substring2);




    }
}
