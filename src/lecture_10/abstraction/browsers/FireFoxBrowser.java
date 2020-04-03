package lecture_10.abstraction.browsers;

/**
 * Created by alpa on 4/2/20
 */
public class FireFoxBrowser extends Browser {

    public static final String FIRE_FOX = "FireFox";

    @Override
    public void open() {
        System.out.println("Open " + FIRE_FOX + " browser");
    }

    @Override
    public void moveForward() {
        System.out.println("Forward in " + FIRE_FOX + " browser");
    }

    @Override
    public void moveBack() {
        System.out.println("Back in " + FIRE_FOX + " browser");
    }
}
