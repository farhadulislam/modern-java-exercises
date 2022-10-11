package islam.farhad.exercises.java8stream.pluralsight;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodeFromPLGuide1 {

    // Stream API part2
    public static void main(String[] args) {
        /*****char to int******/
        Stream.of('a', 'b','c', 'd', 'e')
                .map( c ->(int)c)
                .forEach(i -> System.out.printf("%d", i));
        /*Stream.of(101, 102, 103,104)
                .map( i -> (char)i)
                .forEach( c -> System.out.printf("%c", c));*/

        /*****int to double******/
        /***flatMap() returns a stream while map() returns an element.********/
        IntStream.of(100, 200, 210, 320, 340)
                .mapToDouble(i -> i/3)
                .forEach(d -> System.out.printf("\n%.2f ", d));
        /*****flatmap******/
        List<Character> aToD = Arrays.asList('a', 'b', 'c', 'd');
        List<Character> eToG = Arrays.asList('e', 'f', 'g');

        Stream<List<Character>> streamOfListOfChars = Stream.of(aToD,eToG);
        streamOfListOfChars
                .flatMap(l -> l.stream())
                .map( c -> (int)c)
                .forEach(i -> System.out.printf("\n%d ", i));

        Stream.of(aToD,eToG)
                .flatMap(l-> l.stream())
                .peek(System.out::println)
                .map( c -> (int)c)
                .forEach(i -> System.out.printf("\n%d", i));

        /******* OptinalInt for primitve types*******/
        OptionalInt total = IntStream.of(1, 2, 3, 4, 5, 6)
                .reduce( (sum, n) -> sum + n );
        System.out.println(total.getAsInt());





    }
}
