package lecture_5;

/**
 * Created by alpa on 3/15/20
 */
public class CelsiusToKelvinMethodsExample {

    public static final double KELVIN_COEFFICIENT = 273.15;

    public static void main(String[] args) {
        double celsius = 15D;
        double result = celsiusToKelvin(celsius) * 2;
        System.out.println("Kelvin x2: " + result);

        celsius = 25;
        result = celsiusToKelvin(celsius);
        System.out.println("Kelvin x3: " + result * 3);
    }


    public static double celsiusToKelvin(double celsius) {
        double result = celsius + KELVIN_COEFFICIENT;
        System.out.println("Celsius to Kelvin: " + result);

        return result;
    }
}
