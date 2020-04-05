package lecture_11.interfaces;

/**
 * Created by alpa on 4/5/20
 */
public class BakeryShop extends Shop implements ProductQuantity {

    private String phoneNumber;

    public BakeryShop(int id, String name, String phoneNumber) {
        super(id, name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sell() {
        System.out.println("BakeryShop sell cakes....");
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + " shop, quantity: " +  getProductQuantity());
    }

    @Override
    public int getProductQuantity() {
        return 25;
    }
}
