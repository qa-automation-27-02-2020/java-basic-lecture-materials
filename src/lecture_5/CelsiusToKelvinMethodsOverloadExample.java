package lecture_5;

/**
 * Created by alpa on 3/15/20
 */
public class CelsiusToKelvinMethodsOverloadExample {

    public static final double KELVIN_COEFFICIENT = 273.15;

    public static void main(String[] args) {
        double celsiusDouble = 15D;
        double resultDouble = celsiusToKelvin(celsiusDouble) * 2;
        System.out.println("Kelvin x2: " + resultDouble);

        int celsiusInd = 25;
        double result = celsiusToKelvin(celsiusInd);
        System.out.println("Kelvin x3: " + result * 3);
    }


    public static double celsiusToKelvin(double celsius) {
        double result = celsius + KELVIN_COEFFICIENT;
        System.out.println("Celsius to Kelvin with double: " + result);

        return result;
    }

    public static double celsiusToKelvin(int celsius) {
        double result = celsius * KELVIN_COEFFICIENT;
        System.out.println("Celsius to Kelvin with int: " + result);

        return result;
    }
}
