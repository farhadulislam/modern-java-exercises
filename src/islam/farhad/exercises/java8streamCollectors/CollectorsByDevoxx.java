package islam.farhad.exercises.java8streamCollectors;

import islam.farhad.exercises.java8stream.Person;

import java.util.List;

import static islam.farhad.exercises.java8stream.Person.getPeople;

public class CollectorsByDevoxx {
    public static void main(String[] args) {
       List<Person> people =  Person.getPeople();

        System.out.println(people.stream().map(Person :: getAge)
               //.reduce(0, (subtotal, age)-> (subtotal + age)));
                //.reduce(0,(subtotal, age)-> Integer.sum(subtotal + age))) ;
                .reduce(0, Integer::sum)); // Reduces verbosity.
    }
}
