package lecture_2.lecture_3;

/**
 * Created by alpa on 3/5/20
 */
public class IntroTask4 {

    public static void main(String[] args) {
        withTempVariable(3, 5);
        withoutTempVariable(3, 5);
    }

    public static void withTempVariable(int a, int b) {
        int tmp;

        tmp = a;
        a = b;
        b = tmp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void withoutTempVariable(int a, int b) {
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
