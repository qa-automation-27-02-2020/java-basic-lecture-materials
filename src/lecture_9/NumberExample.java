package lecture_9;

/**
 * Created by alpa on 3/29/20
 */
public class NumberExample {


    public static void main(String[] args) {
        MyNumber first = new MyNumber(1, 2);
        MyNumber second = new MyNumber(1, 2);

        MyNumber plusValue = first.plus(second);
    }
}
