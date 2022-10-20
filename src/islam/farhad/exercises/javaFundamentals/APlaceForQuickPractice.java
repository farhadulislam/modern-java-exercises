package islam.farhad.exercises.javaFundamentals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class APlaceForQuickPractice {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(0, 1, 1, 3,4,5,6);

        integers.forEach(i -> System.out.println(i));

        integers.stream().sorted().forEach(System.out::println);
        integers.stream().distinct().sorted().forEach(System.out::println);
        int sum = integers.stream().filter(i ->i>0).map(num -> num *2).reduce(0, (a, b) -> (a+b));
        System.out.println(sum);
    }
}
