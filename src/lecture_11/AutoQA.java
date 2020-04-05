package lecture_11;

/**
 * Created by alpa on 4/5/20
 */
public class AutoQA implements Employee, IQAStatistic {

    @Override
    public void doWork() {
        System.out.println("AQA create test code");
    }

    @Override
    public int getFoundBugs() {
        return 2;
    }
}
