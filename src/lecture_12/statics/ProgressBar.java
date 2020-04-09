package lecture_12.statics;

/**
 * Created by alpa on 4/9/20
 */
public class ProgressBar {

    private String name;

    static int value;

    static {
        value = 46;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int calculate(int a) {
        return a + 1;
    }
}
