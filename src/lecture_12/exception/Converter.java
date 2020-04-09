package lecture_12.exception;

/**
 * Created by alpa on 4/9/20
 */
public class Converter {

    public double convertCelsiusToKelvin(double value) throws ConverterException {
        if(value < 15) {
            throw new ConverterException("Celsius value should be greater then 15: " + value);
        }
        return value + 273.16;
    }
}
