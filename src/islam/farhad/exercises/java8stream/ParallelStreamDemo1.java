package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamDemo1 {

    public static void main(String[] args) {

        IntStream.range(0, 10).forEach(System.out::println);
        IntStream.range(0, 10).parallel().forEach(System.out::println);

        //

/*
        Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4);
        Stream<String> streamOfStrings = Stream.of("Morocco", "Belgium", "Qatar");
        streamOfStrings.filter( e -> e.startsWith("B")).findFirst().ifPresent(System.out::println);
        int[] numbers = {1, 2, 3, 4};
        IntStream numbersFromArray = Arrays.stream(numbers);
*/

    }
}
