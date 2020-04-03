package lecture_10.abstraction;

/**
 * Created by alpa on 4/2/20
 */
public class FoodMainExample {


    public static void main(String[] args) {
//        Food pasta = new Food("pasta", 2);

        FrenchFries frenchFries = new FrenchFries("FrenchFries", 10);
        frenchFries.eat(1);
        frenchFries.eat(5);

        Pasta pasta = new Pasta(100);
        pasta.eat(10);
        pasta.eat(19);
    }
}
