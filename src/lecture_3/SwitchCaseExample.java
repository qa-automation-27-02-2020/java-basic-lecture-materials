package lecture_3;

/**
 * Created by alpa on 3/5/20
 */
public class SwitchCaseExample {

    public static void main(String[] args) {
//        int price = 100;
//
//        switch (price) {
//            case 50:
//                System.out.println("Success purchase");
//                break;
//            case 100:
//                System.out.println("Not luck, try one more time");
//                break;
//            case 25:
//                System.out.println("You have discount");
//                break;
//            default:
//                System.out.println("Good buy!");
//        }

        String name = "sdfsdf";

        switch (name) {
            case "Geralt":
                System.out.println("The Witcher");
                break;
            case "Yenifer":
                System.out.println("The wizard");
                break;
            case "Lutik":
                System.out.println("Bard");
                break;
            default:
                System.out.println(name + " unknown");
        }


    }
}
