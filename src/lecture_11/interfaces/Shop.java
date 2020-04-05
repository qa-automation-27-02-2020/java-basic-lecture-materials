package lecture_11.interfaces;

/**
 * Created by alpa on 4/5/20
 */
public abstract class Shop {

    private int id;
    private String name;

    public abstract void sell();
    public abstract void showInfo();


    public Shop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
