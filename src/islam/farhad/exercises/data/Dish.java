package islam.farhad.exercises.data;

import static islam.farhad.exercises.data.Dish.DishType.*;

public class Dish {
    public enum DishType{
        MEAT, FISH, VEG, OTHER
    }
    private DishType dishType;
    private String dishName;
    private int calorie;
    private boolean dishAvailable;

    public Dish(DishType dishType, String dishName, int calorie, boolean dishAvailable) {
        this.dishType = dishType;
        this.dishName = dishName;
        this.calorie = calorie;
        this.dishAvailable = dishAvailable;
    }
    public boolean isVegetarian(){
        return dishType== VEG;
    }
    public DishType getDishType() {
        return dishType;
    }

    public String getDishName() {
        return dishName;
    }

    public int getCalorie() {
        return calorie;
    }

    public boolean isDishAvailable() {
        return dishAvailable;
    }
}
