package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.List;

public class DevoxxLambdaAndStreams {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0, 1,2, 3,4,5,6);
        integers.stream()
                .map(String::valueOf)
                .forEach(System.out::println);

        integers.stream()
                .map(e -> String.valueOf(e))
                .map(String::toString)
                .forEach(System.out::println);

       int sum1 = integers.stream()
                .reduce(0, (total, e) -> Integer.sum(total, e)); // method ref can only be used when order of paramaetrs passed remain the same.

        int sum2 = integers.stream()
                .reduce(0, Integer::sum);

        System.out.printf("Sum1 : %d, Sum2 : %d ", sum1, sum2);
    }
}
