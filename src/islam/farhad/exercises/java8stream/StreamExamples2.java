package islam.farhad.exercises.java8stream;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples2 {

    public static void main(String[] args) {

        Stream.iterate(1, i -> i + 1).filter(i -> i % 2 == 0).limit(10).forEach(System.out::println);

        Stream.iterate(1, i -> i + 1).skip(15).limit(20).forEach(System.out::println);

        Stream.of(23, 34, 56, 78, 90, 2, 1, 200, 3, 5, 7, 9, 11).filter(i -> i % 2 != 0).skip(2).limit(5).forEach(System.out::println);
        System.out.println("\nPrinting distinct elements");
        Stream.of(9, 11, 2, 2, 2, 3, 4, 4, 5, 6, 7).distinct().sorted((a, b) -> a > b ? 1 : -1).forEach(System.out::println);

        String[] countries = {"UK", "", "UAE", "Uganda", "Turkiye", "Burma", "Canada", "Bahrain", "Vietnam", "Singapore", "Qatar","USA", "Thailand", "Vietnam", "Singapore", "Qatar"};
        System.out.println("Printing distinct elements");
        Stream.of(countries).distinct().forEach(System.out::println);
        Stream.of(countries).distinct().map(s->s.toUpperCase()).forEach(System.out::println);
        Set<String> setOfCountries = Stream.of(countries).filter(s -> !s.isEmpty()).collect(Collectors.toSet());
        System.out.println("Printing set of countries \n" + setOfCountries);

    }
}
