package lecture_9.inheritance;

import java.util.Random;

/**
 * Created by alpa on 3/29/20
 */
public class Plant {

    private String name;
    private String type;
    private int startYear;

    public Plant(String name, String type, int startYear) {
        this.name = name;
        this.type = type;
        this.startYear = startYear;
    }

    public String getName() {
        return name;
    }

    public int getStartYear() {
        return startYear;
    }


    public String getType() {
        return type;
    }


    public int startProduceProduction() {
        System.out.println(String.format("start production of %s at %s", this.type, this.name));
//        return (int) Math.random();
        return new Random().nextInt(1000);
    }
}
