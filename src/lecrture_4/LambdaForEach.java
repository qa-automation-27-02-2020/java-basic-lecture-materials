package lecrture_4;

import java.util.stream.Stream;

/**
 * Created by alpa on 3/12/20
 */
public class LambdaForEach {

    public static void main(String[] args) {
        String[] cars = {"Subaru", "Mazda", "Toyota", "Ford", "Audi"};

//        for (String car : cars) {
//            System.out.println(car);
//        }

//        Stream.of(cars)
//                .forEach(car -> {
//            System.out.println(car);
//        });

        Stream.of(cars).forEach(System.out::println);
    }
}
