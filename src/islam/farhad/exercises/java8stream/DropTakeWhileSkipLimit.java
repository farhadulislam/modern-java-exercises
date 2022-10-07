package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
                .takeWhile(dish -> dish.getCalorie()> 320)
                .collect(toList());
        slicedMenu1.stream().map( dish-> dish.getDishName()).forEach(System.out::println);

        System.out.println(" ");

        List<Dish> slicedMenu2 = menu.stream()
                .dropWhile(dish -> dish.getCalorie()> 320)
                .collect(toList());
        slicedMenu2.stream().map( dish-> dish.getDishName()).forEach(System.out::println);


        // Truncating a Stream
        System.out.println("\nDishes above 300 cal");
        List<Dish> above300 =
        menu.stream().filter(dish-> dish.getCalorie() > 300)
                .limit(3)
                .collect(toList());
        above300.stream().map(dish-> dish.getDishName()).forEach(System.out::println);

        System.out.println("\nDishes above 300 cal but skipping first two");
        List<Dish> above300skippingFirstTwo =
                menu.stream().filter(dish-> dish.getCalorie() > 300)
                        .skip(2)
                        .collect(toList());
        above300skippingFirstTwo.stream().map(dish-> dish.getDishName()).forEach(System.out::println);

        //Mapping
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());

        List<Dish> dishesMeat =
                menu.stream()
                        .filter(dish -> dish.getDishType() == Dish.DishType.MEAT)
                        .limit(2)
                        .collect(toList());

        List<Integer> dishNameLengths = menu.stream()
                .map(Dish::getDishName)
                .map(String::length)
                .collect(toList());

        System.out.println("Printing vegetarian dishes");
        menu.stream()
                .filter(Dish::isVegetarian)
                .map(dish->dish.getDishName())
                .forEach(System.out::println);


        //IntSummaryStatistics
        List<Integer> totalCalories = menu.stream().map(dish-> dish.getCalorie()).toList();
        IntSummaryStatistics stats = totalCalories.stream().collect(Collectors.summarizingInt(Integer::valueOf));
        System.out.println("Min cal " + stats.getMin());
        System.out.println("Max cal " + stats.getMax());
        System.out.println("Avg cal " + stats.getAverage());
        System.out.println("Count " + stats.getCount());
        System.out.println("Sum of cal " + stats.getSum());

        //anyMatch(), noneMatch, allMatch
        if(menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu has vegetarian options.");
        }
        boolean isHealthy1 = menu.stream().allMatch(dish-> dish.getCalorie()<1000);
        if(isHealthy1)
            System.out.println("All dishes below 1000 cal. Menu is healthy");
        boolean isHealthy2 = menu.stream().noneMatch(dish-> dish.getCalorie()>=1000);
        if(isHealthy2)
            System.out.println("None above 1000 cal. Menu is healthy");

    }
}
