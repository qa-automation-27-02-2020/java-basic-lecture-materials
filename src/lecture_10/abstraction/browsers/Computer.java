package lecture_10.abstraction.browsers;

/**
 * Created by alpa on 4/2/20
 */
public class Computer {

    private Browser browser;

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void openBrowser() {
        browser.open();
    }
}
