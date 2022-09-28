package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFilterReduceDemo3 {
    // MIT
    public static void main(String ... args){
        //Creating stream from a List
        List<Integer> intList = Arrays.asList(2,3,4,5,6);
        Stream<Integer> intStream = intList.stream();
        //Stream from array
        String [] stringArray = {"apple", "carrot", "banana"};
        Stream<String> strStream = Arrays.stream(stringArray);

        //MAP
        // Map applies a unary function to each element in the stream
        // and returns a new stream containing the results, in the same order

        List<Integer> listOfInts = Arrays.asList(23,3,4,56,67);
        Stream<Integer> streamOfInts = listOfInts.stream();
        Stream<Double> streamOfDoubles = streamOfInts.map(x -> Math.sqrt(x));

        Arrays.asList("a", "b", "c", "d")
                .stream()
                .map( s ->s.toUpperCase())
                .forEach(u -> System.out.printf(u));

        //Method Ref
        Arrays.asList(23,34,56,78).stream()
                .map(Math::sqrt);

        //FILTER
        Arrays.asList('x', 'y', 'z', '2', '3', 'm').stream()
                .filter(Character::isLetter);

        Arrays.asList(2,3,4,5,6,7,8,9).stream()
                .filter(x -> x%2==1);

        Arrays.asList("", "abc", "def").stream()
                .filter(s -> !s.isEmpty());

        //Reduce
        Arrays.asList(2,3,4,5,6,90).stream()
                .reduce(0, (a,b) -> a + b );




    }
}
