package islam.farhad.exercises.java8stream;

import java.util.Random;
import java.util.stream.Stream;

public class IterateAndGenerate {
    public static void main(String[] args) {
        //Stateful- always returns same result.
        Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);
        System.out.println("Stream generate");
        Stream.generate(() -> (new Random()).nextInt(100)).limit(10).forEach(System.out::println);
        System.out.println("Steam takewhile");
        Stream.generate(() -> (new Random()).nextInt(1000))
                .takeWhile( n -> n <= 500)
                .forEach(System.out::println);

    }
}