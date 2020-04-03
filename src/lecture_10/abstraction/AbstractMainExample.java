package lecture_10.abstraction;

/**
 * Created by alpa on 4/2/20
 */
public class AbstractMainExample {

    public static void main(String[] args) {
        Restorant mcdak = new Restorant("McDack", new FrenchFries("FrenchFries", 10));
        Food mcdakFood = mcdak.getFood();
        mcdakFood.eat(5);

        Restorant italia = new Restorant("McDack", new Pasta(100));
        Food italiaFood = italia.getFood();
        italiaFood.eat(26);

        if (mcdakFood instanceof Pasta) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");

        }
    }

}
