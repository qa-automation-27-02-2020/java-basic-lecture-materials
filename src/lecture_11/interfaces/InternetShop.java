package lecture_11.interfaces;

/**
 * Created by alpa on 4/5/20
 */
public class InternetShop extends Shop {

    private String url;

    public InternetShop(int id, String name, String url) {
        super(id, name);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void sell() {
        System.out.println("InternetShop sell some products...");
    }

    @Override
    public void showInfo() {

        System.out.println(getName() + " shop");
    }
}
