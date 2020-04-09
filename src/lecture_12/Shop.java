package lecture_12;

/**
 * Created by alpa on 4/9/20
 */
public class Shop {


    public void showProducts(User user) {
        Role role = user.getRole();
        switch (role) {
            case ADMIN:
                System.out.println("Show products for admin");
                break;
            case GUEST:
                System.out.println("Show products for guest");
                break;
            case AUTH:
                System.out.println("Show products for auth");
                break;
        }
    }

    public void showBasket(User user) {
        Role role = user.getRole();
        switch (role) {
            case ADMIN:
                System.out.println("Show products for admin");
                break;
            case GUEST:
                System.out.println("Show products for guest");
                break;
            case AUTH:
                System.out.println("Show products for auth");
                break;
        }

        if (role.getPermission() == 0) {
            System.out.println("Show basket for user with 1 level access!");
        } else {
            System.out.println("Show basket for user with no access");

        }
    }
}
