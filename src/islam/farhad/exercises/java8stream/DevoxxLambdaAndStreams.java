package islam.farhad.exercises.java8stream;

import islam.farhad.exercises.commonTools.TimeIt;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

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
                //.reduce(0, (total, e) -> Integer.sum(total, e)); // method ref can only be used when order of paramaetrs passed remain the same.
                .reduce(0, Integer::sum);// Used method ref here instead of above.
        System.out.printf("Sum using reduce and method ref : %d\n", sum1);
        System.out.println("String concat using method ref");

        System.out.println(integers.stream()
                .map(String::valueOf)
                //.reduce("", (carry, str)-> carry.concat(str))); //Here, 1st param is a target and 2nd is an args.
                .reduce("", String::concat));

        //Given a set of values, double the even numbers and then return the total

        int result = 0;
        for (int e : integers){
            if (e%2==0){
                result += e *2;
            }
        }
        System.out.println("Imperative style " + result);

        System.out.println("Functional style using stream : " +
                integers.stream()
                .filter( i-> i%2 ==0)
                .map(i -> i * 2)
                .reduce(0, Integer::sum));

        System.out.println("Even better this way "+
                integers.stream()
                        .filter( i-> i%2 ==0)
                        .mapToInt(i -> i * 2)
                        .sum());
        System.out.println("Transforming int to double " + integers.stream()
                .map( e -> e * 2.0)
                .collect(Collectors.toUnmodifiableList()));

        // Running it inside thread and taking advantage of parallel stream

        TimeIt.code(()->
                System.out.println(
                // integers.stream()
                integers.parallelStream()
                .filter( n -> n % 2 == 0)
                .mapToInt(DevoxxLambdaAndStreams::compute)
                        .sum()));

        System.out.println("Create map from stream");
        System.out.println(Person.getPeople().stream().collect(toMap(
                person -> person.getName() +"-" + person.getAge(),
                person -> person)));

        System.out.println("Grouping by name");
        System.out.println(Person.getPeople().stream()
                .collect(groupingBy(Person::getName,mapping(Person::getAge, toList()))));

        System.out.println("Find first even number greater that 3 and double it");
        System.out.println(integers.stream()
                .filter( e -> e > 3)
                .filter( e -> e % 2 ==0)
                .map( e -> e * 2)
                .findFirst()); // this returns an optional
        System.out.println("Find distinct elements and sort them");
        List<Integer> numbers = Arrays.asList(1,4,7,3,4,0,3,5,9,1,2,6,8,2,9);
        numbers.stream()
                        .filter( e -> e > 0)
                                .sorted()
                                        .distinct().forEach(System.out::println);


        System.out.println("Create infinite stream");
        System.out.println(Stream.iterate(1, e -> e + 1)
                .filter( e -> e % 2 ==0)
                .filter( e -> Math.sqrt(e)> 20)
                .mapToInt(e -> e * 2)
                .limit(3)
                .sum());
    }



    public static int compute(int n){
        try{Thread.sleep(1000);}catch(Exception ex){}
        return n * 2;
    }
}
