package islam.farhad.exercises.stream.pluralsight;

import islam.farhad.exercises.stream.Person;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsFromArray {

    public static void main(String [] args){
        Person p1 = new Person("Raisul",  34);
        Person p2 = new Person("Simrah", 10 );
        Person p3 = new Person ("Abid", 28 );
        Person p4 = new Person ("Asif", 37);
        Person p5 = new Person ("Neptune", 37 );
        Person p6 = new Person ("Macron", 45 );
        Person p7 = new Person ("Jamil", 35 );
        Person p9 = new Person ("Nayan", 34 );
        Person p8 = new Person ("Tom", 60 );

        Person [] people = {p1, p2, p3, p4, p5};

        //Two ways to create Stream from an array
        Stream<Person> peopleStream1 = Arrays.stream(people);
        Stream<Person> peopleStream2 = Stream.of(people);

        //
        long count = Stream.of(people).count();
        System.out.println("Count = " + count);

        Arrays.stream(people).forEach(p -> System.out.println(p));
        //Can be re-written as method ref, check below.
        Arrays.stream(people).forEach(System.out::println);

    }
}
