package lecture_12;

/**
 * Created by alpa on 4/9/20
 */
public class EnumExample {

    public static void main(String[] args) {
        User admin = new User("Bob", Role.ADMIN);
        User guest = new User("Bob", Role.GUEST);
        User authUser = new User("Bob", Role.AUTH);

        Shop shop = new Shop();

        shop.showProducts(admin);
        shop.showBasket(admin);
        shop.showBasket(guest);
//        shop.showProducts(guest);
//        shop.showProducts(authUser);
    }


}
