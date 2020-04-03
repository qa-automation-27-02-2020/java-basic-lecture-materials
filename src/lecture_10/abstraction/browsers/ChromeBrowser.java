package lecture_10.abstraction.browsers;

/**
 * Created by alpa on 4/2/20
 */
public class ChromeBrowser extends Browser {

    public static final String CHROME = "Google chrome";

    @Override
    public void open() {
        System.out.println("Open " + CHROME + " browser");
    }

    @Override
    public void moveForward() {
        System.out.println("Forward in " + CHROME + " browser");
    }

    @Override
    public void moveBack() {
        System.out.println("Back in " + CHROME + " browser");
    }

    public void openDevTool() {
        System.out.println("Open DevTool in " + CHROME + " browser");
    }

}

