package lecture_10;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by alpa on 4/2/20
 */
public class Phone {

    private String name;
    private String[] phoneNumbers;

    public Phone(String name, String[] phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void changePhoneNumbersFormat(String formatSymbol) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            phoneNumbers[i] = formatSymbol + phoneNumbers[i] ;
        }
    }

    public final void printPhoneInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Objects.equals(getName(), phone.getName()) &&
                Arrays.equals(getPhoneNumbers(), phone.getPhoneNumbers());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(getPhoneNumbers());
        return result;
    }
}
