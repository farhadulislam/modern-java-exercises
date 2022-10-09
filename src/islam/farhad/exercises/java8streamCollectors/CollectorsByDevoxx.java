package islam.farhad.exercises.java8streamCollectors;

import islam.farhad.exercises.java8stream.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static islam.farhad.exercises.java8stream.Person.getPeople;
import static java.util.stream.Collectors.toMap;

public class CollectorsByDevoxx {
    public static void main(String[] args) {
       List<Person> people =  Person.getPeople();

        System.out.println(people.stream().map(Person :: getAge)
               //.reduce(0, (subtotal, age)-> (subtotal + age)));
                //.reduce(0,(subtotal, age)-> Integer.sum(subtotal + age))) ;
                .reduce(0, Integer::sum)); // Reduces verbosity.

        System.out.println(getPeople().stream()
                 . filter(person -> person.getAge() < 30)
                 .map(Person::getName)
                 .map(String::toUpperCase)
                 .collect(Collectors.toList()));

        //Map name and age as key and value - imperative way
        Map<String, Integer> nameAgeMap = new HashMap<>();
        for(Person person : getPeople()){
            nameAgeMap.put(person.getName(), person.getAge());
        }
        System.out.println(nameAgeMap);

        // Do the same, but in a functional way.
        System.out.println(getPeople().stream()
                //.collect(Collectors.toMap(keyFunction, valueFunction));
                //.collect(toMap(person -> person.getName(), person -> person.getAge() )));
                .collect(toMap(Person::getName, Person::getAge)));
    }
}
