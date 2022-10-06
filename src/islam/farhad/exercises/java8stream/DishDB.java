package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.List;

public class DishDB {

    public static List<Dish> getDishes(){
        return Arrays.asList(
                new Dish(Dish.DishType.MEAT, "Thai Curry", 200, true),
                new Dish(Dish.DishType.FISH, "Rohu Curry", 100, true),
                new Dish(Dish.DishType.VEG, "Cauliflower Curry", 130, true),
                new Dish(Dish.DishType.MEAT, "Biryani", 400, true),
                new Dish(Dish.DishType.VEG, "Alu Vorta", 10, true),
                new Dish(Dish.DishType.VEG, "Khichuri", 235, true),
                new Dish(Dish.DishType.OTHER, "Mishti Doi", 190, true),
                new Dish(Dish.DishType.OTHER, "Borhani", 35, true),
                new Dish(Dish.DishType.OTHER, "Panta", 15, true),
                new Dish(Dish.DishType.MEAT, "Fried Chicken", 390, true),
                new Dish(Dish.DishType.MEAT, "Lamb Karahi", 399, true),
                new Dish(Dish.DishType.VEG, "Daal", 105, true),
                new Dish(Dish.DishType.VEG, "Mixed Veg", 90, true),
                new Dish(Dish.DishType.MEAT, "Burger", 399, true),
                new Dish(Dish.DishType.MEAT, "Pizza", 505, true));
    }
}
