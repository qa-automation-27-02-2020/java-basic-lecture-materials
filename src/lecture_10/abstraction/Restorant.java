package lecture_10.abstraction;

/**
 * Created by alpa on 4/2/20
 */
public class Restorant {

    private String name;
    private Food food;

    public Restorant(String name, Food food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }
}
