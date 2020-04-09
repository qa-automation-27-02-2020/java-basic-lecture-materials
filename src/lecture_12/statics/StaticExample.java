package lecture_12.statics;

/**
 * Created by alpa on 4/9/20
 */
public class StaticExample {

    public static void main(String[] args) {
        System.out.println(ProgressBar.value);
        ProgressBar progressBar = new ProgressBar();
        progressBar.setName("bar1");
        System.out.println(progressBar.getName());
        System.out.println(progressBar.value);

        ProgressBar.value = 12;
        ProgressBar progressBar2 = new ProgressBar();
        progressBar2.setName("bar2");
        System.out.println(progressBar2.getName());
        System.out.println(progressBar2.value);

        int calculate = ProgressBar.calculate(1);
        System.out.println(calculate);
        String.valueOf(1);

    }

}
