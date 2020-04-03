package lecture_10.abstraction;

/**
 * Created by alpa on 4/2/20
 */
public class Pasta extends Food {

    public Pasta(int quantity) {
        super(quantity);
    }

    public void addFood(int quantity) {
        int leftQuantity = getQuantity() + quantity;
        setQuantity(leftQuantity);
    }

    @Override
    public void eat(int quantity) {
        int leftQuantity = getQuantity() - quantity;
        System.out.println("Left pasta quantity: "  + leftQuantity);
        setQuantity(leftQuantity);
    }

}
