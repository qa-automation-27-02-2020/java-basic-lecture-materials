package lecrture_4;

/**
 * Created by alpa on 3/12/20
 */
public class VariableExample {

    public static void main(String[] args) {




    }

    public static String getGreatestNumberByMagnitude(double a, double b) {
        String result = "";
        double numberA = Math.abs(a);
        double numberB = Math.abs(b);

        if (numberA == numberB) {
            result = "The number "+a+" and "+b+" are equals by magnitude!";
        } else {
            result = numberA > numberB ? "The number " + a + " has the greatest magnitude!" : "The number " + b + " has the greatest magnitude!";
        }
        return result;
    }
}
