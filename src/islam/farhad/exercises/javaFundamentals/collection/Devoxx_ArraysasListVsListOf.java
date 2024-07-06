package islam.farhad.exercises.javaFundamentals.collection;

import java.util.List;

import static java.lang.System.*;

public class Devoxx_ArraysasListVsListOf {

    public static void main(String[] args) {
        //List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2,3)); // Type is class java.util.ArrayList - Supports both add and set
        //List<Integer> numbers = Arrays.asList(1, 2,3); // Type is class java.util.Arrays$ArrayList - Supports add but not set
        List<Integer> numbers = List.of(1, 2,3); // Type is class java.util.Arrays$ArrayList - Supports neither add nor set - recommended to use this.

        out.println(numbers);
        out.println(numbers.getClass());

        try {
            numbers.add(4);
        } catch (Exception e) {
            out.println("Add not supported");
        }

        out.println(numbers);
        try {
            numbers.set(2, 2);
        } catch (Exception e) {
            out.println("set not supported");
        }
        out.println(numbers);
    }
}
