package islam.farhad.exercises.java8stream;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.rangeClosed;

/*
*Use range or rangeClosed when ordered elements needed.
* */
public class Range_RangeClosed {
    public static void main(String[] args) {
        //Doesn't consider the last value
        IntStream.range(91, 100).forEach(System.out::println);

        rangeClosed(91, 100).forEach(System.out::println);
    }
}
