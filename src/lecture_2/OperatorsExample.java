package lecture_2;

/**
 * Created by alpa on 3/1/20
 */
public class OperatorsExample {

    public static void main(String[] args) {

        int a = 25;
        int b = 5;

        int sumResult = a + b;
        System.out.println("sumResult: " + sumResult);

        int minusResult = b - a;
        System.out.println("minusResult: " + minusResult);

        int multipleResult = a * b;
        System.out.println("multipleResult: " + multipleResult);

        int divideResult = a / b;
        System.out.println("divideResult: " + divideResult);

//        int divideToZero = a / 0;  //java.lang.ArithmeticException: / by zero

        int mixResult = (5 + 2) * 4;
        System.out.println("mixResult: " + mixResult);

        double number1 = 2.47D;
        double number2 = 5.234D;
        double resultDouble = number1 * number2;
        System.out.println("resultDouble: " + resultDouble);

        double divideResult2 = 20.0 / 3.0;
        System.out.println("divideResult2: " + divideResult2);

    }
}
