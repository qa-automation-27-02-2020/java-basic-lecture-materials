package lecture_5;

/**
 * Created by alpa on 3/15/20
 */
public class SumOfGivenArrayMethodExample {

    public static void main(String[] args) {
//        int[] array = new int[5];
//        array[0] = 38;
//        array[1] = 1345;
//        array[2] = 456;
        int[] arrayFibonacci = {1, 1, 2, 3, 5, 8, 13, 21};

        int arraySumResultFibonacci = arraySumCalculation(arrayFibonacci);
        System.out.println("Array number sum result: " + arraySumResultFibonacci);

        int[] arraySimple = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int arraySumResultSimple = arraySumCalculation(arraySimple);
        System.out.println("Array number sum result: " + arraySumResultSimple);

        int[] arrayEmpty = {};

        int arraySumResultEmpty = arraySumCalculation(arrayEmpty);
        System.out.println("Array number sum result: " + arraySumResultEmpty);
    }

    public static int arraySumCalculation(int[] array) {
        int sumValuesResult = 0;
        for (int value : array) {
            sumValuesResult += value;
        }

        return sumValuesResult;
    }

//    public static int arraySumCalculation(int[] array) {
//        int sumValuesResult = 0;
//        int previousValue = 0;
//        for (int currentValue : array) {
//            sumValuesResult = previousValue + currentValue;
//            previousValue = sumValuesResult;
//        }
//
//        return sumValuesResult;
//    }
}
