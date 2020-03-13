package lecrture_4;

/**
 * Created by alpa on 3/12/20
 */
public class ForEachLoopExample {

    public static void main(String[] args) {
        String[] cars = {"Subaru", "Mazda", "Toyota", "Ford", "Audi"};

//        for (int i = 0; i < cars.length; i++) {
//            String car = cars[i];
//            System.out.println(car);
//        }

        for (String car: cars) {
            if (car == "Subaru") {
                System.out.println("Kolesnica of the God!");
                continue;
            }
            if (car == "Mazda") {
                System.out.println("Nuuu not bad!");
                continue;
            }
            if (car == "Toyota") {
                System.out.println("From USA");
                continue;
            }
            System.out.println(car);
        }
    }
}
