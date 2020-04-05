package lecture_11.interfaces;

/**
 * Created by alpa on 4/5/20
 */
public class FlowerShop extends Shop implements ProductQuantity {

    public FlowerShop(int id, String name) {
        super(id, name);
    }

    @Override
    public void sell() {
        System.out.println("FlowerShop sell flower...");
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + " shop, quantity: " +  getProductQuantity());
    }

    @Override
    public int getProductQuantity() {
        return 100;
    }
}

