package lecture_11.interfaces;

/**
 * Created by alpa on 4/5/20
 */
public class FactoryMain {

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop(1, "Flower");
//        flowerShop.showInfo();
        BakeryShop bakeryShop = new BakeryShop(2, "Bakery", "12345678");
//        bakeryShop.showInfo();
        InternetShop internetShop = new InternetShop(3, "InetShop", "http://inet-shop.ua");
        internetShop.showInfo();

        InformationDashboard dashboard = new InformationDashboard();
        dashboard.showProducts(flowerShop);
        dashboard.showProducts(bakeryShop);
//        dashboard.showProducts(internetShop);

    }
}
