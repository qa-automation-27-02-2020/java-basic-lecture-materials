package lecture_11;

/**
 * Created by alpa on 4/5/20
 */
public class ManualQA implements Employee, IQAStatistic {

    @Override
    public void doWork() {
        System.out.println("Manual QA test code");
    }

    @Override
    public int getFoundBugs() {
        return 10;
    }
}
