package lecture_9.inheritance;

import java.util.Random;

/**
 * Created by alpa on 3/29/20
 */
public class OverPerformedPlant extends Plant {


    public OverPerformedPlant(String name, String type, int startYear) {
        super(name, type, startYear);
    }

    @Override
    public int startProduceProduction() {
        System.out.println(String.format("start production of %s at %s", getType(), getName()));
        return new Random().nextInt(100000);
    }

    public int startProduceProduction(int number) {
        System.out.println(String.format("start production of %s at %s", getType(), getName()));
        return new Random().nextInt(number);
    }
}
