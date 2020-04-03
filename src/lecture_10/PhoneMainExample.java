package lecture_10;

/**
 * Created by alpa on 4/2/20
 */
public class PhoneMainExample {

    public static void main(String[] args) {
        Phone phone = new Phone("iPhone", new String[]{"096123432", "093103441", "066803149"});
        phone.printPhoneInfo();

        phone.changePhoneNumbersFormat("+380");

        phone.printPhoneInfo();

        LandLinePhone landLinePhone = new LandLinePhone("home", new String[]{"096123432", "093103441", "066803149"});
        landLinePhone.changePhoneNumbersFormat("+307");
        landLinePhone.printPhoneInfo();

    }
}
