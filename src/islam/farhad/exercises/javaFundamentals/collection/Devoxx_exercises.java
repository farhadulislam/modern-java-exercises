package islam.farhad.exercises.javaFundamentals.collection;

import java.util.ArrayList;
import java.util.List;

public class Devoxx_exercises {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        //Collection<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(numbers);
        numbers.remove(1); // List's method remove - arg is index, Collections method remove - arg is obj
        System.out.println(numbers);


    }
}
