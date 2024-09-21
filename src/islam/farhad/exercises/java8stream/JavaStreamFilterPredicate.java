package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JavaStreamFilterPredicate {
    public static void main(String[] args) {
        final List<Integer> nums = Arrays.asList(1, 20, 21, 23, 25);
        nums.stream()
                .filter(isGreaterThan(20))
                .forEach(System.out::println);
        final List<String> names = Arrays.asList("newcastle", "sydney", "tokyo", "doha");
        names.stream()
        .map(name -> toUpperCase(name)).
                forEach(System.out::println);


    }

    public static Predicate<Integer> isGreaterThan(Integer num){
        return element -> element > num;
    }
    public static String toUpperCase(String s){
        return s.toUpperCase();
    }
}
