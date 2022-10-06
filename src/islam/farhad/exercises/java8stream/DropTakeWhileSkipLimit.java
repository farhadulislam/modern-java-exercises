package islam.farhad.exercises.java8stream;

import java.util.List;
import java.util.stream.Collectors;

//Java 9 feature takeWhile() and dropWhile()
public class DropTakeWhileSkipLimit {
    public static void main(String[] args) {

        List<Dish> menu = DishDB.getDishes();

        /*List<Dish> calLessThan150menu = menu.stream()
                .filter(dish -> dish.getCalorie() <150)
                .collect(Collectors.toList());
        calLessThan150menu.stream().map(dish -> dish.getDishName()).forEach(System.out::println);

        */

        List<Dish> slicedMenu1 = menu.stream()
                .takeWhile(dish -> dish.getCalorie()> 320).collect(Collectors.toList());
        slicedMenu1.stream().map( dish-> dish.getDishName()).forEach(System.out::println);
        System.out.println(" ");
        List<Dish> slicedMenu2 = menu.stream()
                .dropWhile(dish -> dish.getCalorie()> 320).collect(Collectors.toList());
        slicedMenu2.stream().map( dish-> dish.getDishName()).forEach(System.out::println);


        // Truncating a Stream
        System.out.println("\nDishes above 300 cal");
        List<Dish> above300 =
        menu.stream().filter(dish-> dish.getCalorie() > 300)
                .limit(3)
                .collect(Collectors.toList());
        above300.stream().map(dish-> dish.getDishName()).forEach(System.out::println);

        System.out.println("\nDishes above 300 cal but skipping first two");
        List<Dish> above300skippingFirstTwo =
                menu.stream().filter(dish-> dish.getCalorie() > 300)
                        .skip(3)
                        .collect(Collectors.toList());
        above300skippingFirstTwo.stream().map(dish-> dish.getDishName()).forEach(System.out::println);

    }
}
