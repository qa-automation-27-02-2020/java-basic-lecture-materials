package lecture_9;

/**
 * Created by alpa on 3/29/20
 */
public class MyNumber {

    private int first;
    private int second;

    public MyNumber(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public MyNumber plus(MyNumber number) {
        return new MyNumber(this.first + number.first, this.second + number.second);
    }

}
