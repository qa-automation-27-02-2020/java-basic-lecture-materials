package lecture_8;

import lecture_8.lecture_8_1.User;

/**
 * Created by alpa on 3/26/20
 */
public class ObjectExample {

    public static void main(String[] args) {
        User user = new User("Alex", 30, "alex@gmail.com");
        user.printEmail();
        System.out.println(user.isAdult());
//        user.showInfo()

        User user2 = new User("John", 17, "john@mai.com");
        user2.printEmail();
        System.out.println(user2.isAdult());


//        User user3 = new User("Bob");
//        System.out.println(user3.userName);
    }


//    public static void printUserInfo(User user) {
//        if (user.email.contains("@")) {
//            System.out.println(String.format("My name is %s, age %s, email %s", user.userName, user.age, user.email));
//        }
//
//    }

}
