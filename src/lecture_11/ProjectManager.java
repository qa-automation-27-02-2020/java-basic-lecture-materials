package lecture_11;

/**
 * Created by alpa on 4/5/20
 */
public class ProjectManager implements Employee {

    @Override
    public void doWork() {
        System.out.println("PM do manager work");
    }


    public void showFoundedBugInfo(IQAStatistic statistic) {
        System.out.println("Found " + statistic.getFoundBugs() + " bugs.");
    }
}
