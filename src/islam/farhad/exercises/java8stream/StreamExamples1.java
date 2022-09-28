package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.*;

public class StreamExamples1 {

    public static void main(String[] args) {

        Stream<String> emptyStream = Stream.empty();

        // Stream from a collection interface
        Collection<String> collectionOfStrings = Arrays.asList("Air", "Water", "Soil", "Gas");
        Stream<String> streamFromCollection = collectionOfStrings.stream();

        // Stream from an array. Yes, an array can be a stream source
        Stream<String> streamFromArray = Stream.of("Stream", "From", "An Array");

        // Stream can also be created from an existing array or part of an array
        Integer [] arrayOfInts = new Integer []{0,1,2,4,5,};
        Stream<Integer> streamOfIntegerArray = Arrays.stream(arrayOfInts);
        Stream<Integer> streamOfIntegerArrayPart = Arrays.stream(arrayOfInts, 0, 3);

        //Stream builder
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        // It creates 10 Element strings
        Stream<String> streamGenerated = Stream.generate(()->"Element").limit(10);

        //Create a stream using iterate method
        Stream<Integer> streamOfIntsIterated = Stream.iterate(10, n -> n +2 ).limit(20);

        // Stream of primitives.
        IntStream intStream = IntStream.range(1,3);
        LongStream longStream = LongStream.rangeClosed(1,3);

        Random random = new Random();

        DoubleStream doubleStream = random.doubles(3);

        // chars() methods of String class added to Java 9+
        // chars() returns an IntStream.

        IntStream streamOfChars = "xyz".chars();

        //It breaks string into sub-strings according to regEx
        Stream<String> streamOfStrings = Pattern.compile(", ").splitAsStream("abcd");

        //Ways to print stream elements
        //streamOfStrings.forEach(System.out::println);
        streamOfStrings.forEach( s -> System.out.println(s));
        System.out.println(streamOfStrings.collect(Collectors.toList()));




    }
}

