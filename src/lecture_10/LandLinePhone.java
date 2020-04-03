package lecture_10;

/**
 * Created by alpa on 4/2/20
 */
public class LandLinePhone extends Phone {

    public LandLinePhone(String name, String[] phoneNumbers) {
        super(name, phoneNumbers); // new Phone(name, phoneNumbers)
    }

    @Override
    public void changePhoneNumbersFormat(String formatSymbol) {
        String[] phoneNumbers = getPhoneNumbers();
        for (int i = 0; i < phoneNumbers.length; i++) {
            phoneNumbers[i] = phoneNumbers[i] + formatSymbol;
        }
    }

    public void printPhoneInfo(String value) {
        System.out.println();
    }
}
