package lecture_10.abstraction.browsers;

/**
 * Created by alpa on 4/2/20
 */
public class BrowserMain {

    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        Browser firefox = new FireFoxBrowser();

        Computer computer = new Computer();
        computer.setBrowser(firefox);
        computer.openBrowser();
    }
}
