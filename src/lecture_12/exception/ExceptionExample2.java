package lecture_12.exception;

/**
 * Created by alpa on 4/9/20
 */
public class ExceptionExample2 {

    public static void main(String[] args) {
        Converter converter = new Converter();

        double kelvin = 0;
        try {
            double kelvin2 = converter.convertCelsiusToKelvin(10);
            System.out.println("Kelvin: " + kelvin2);
            kelvin = converter.convertCelsiusToKelvin(20.4);
            System.out.println("Kelvin: " + kelvin);
        } catch (ConverterException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
