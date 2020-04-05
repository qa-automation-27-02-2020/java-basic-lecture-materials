package lecture_11.interfaces;

/**
 * Created by alpa on 4/5/20
 */
public class InformationDashboard {


    public void showProducts(ProductQuantity productQuantity) {
        System.out.println(productQuantity.getName() + " shop, quantity: " +  productQuantity.getProductQuantity());
    }
}
