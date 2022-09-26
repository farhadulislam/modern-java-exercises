package islam.farhad.exercises.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String ... args){

        List<Person> people = getPeople(); // Returns an immutable list of type Person using List.of() method
        List<Person> females = new ArrayList<>();

        Person p1 = new Person("Safa", 30, Gender.FEMALE);
        Person p2 = new Person("Tasnia", 25, Gender.FEMALE);
        Person p3 = new Person("Payel", 26, Gender.FEMALE);
        Person p4 = new Person("Nazifa", 28, Gender.FEMALE);
        Person p5 = new Person("Zovan", 30, Gender.MALE);
        Person p6 = new Person("Tausif", 32, Gender.MALE);
        Person p7 = new Person("Mishu", 34, Gender.MALE);
        Person p8 = new Person("Khairul", 28, Gender.MALE);

        List<Person> people2 = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

        Stream<Person> peopleStream = people2.stream();
        Stream<String> nameStream = peopleStream.map(p -> p.getName());
        Stream<String> nonEmptyNamesStream = nameStream.filter(name -> !name.isEmpty());
        long countNonEmptyNames = nonEmptyNamesStream.count();
        System.out.println("Non Empty names : " + countNonEmptyNames);

        // instead of the above, I could've written in this way.
        long countNonEmptyNames2 = people2.stream()
                                    .map(p -> p.getName())
                                    .filter(name -> !name.isEmpty())
                                    .count();





        /*Imperative approach*/

        for(Person person : people){
            if (person.getGender().equals(Gender.FEMALE))
                females.add(person);
        }
        females.forEach(System.out::println);

        /*Declarative*/
        /*Filter*/

        List<Person> females_2 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females_2.forEach(System.out::println);

        /*Sorting*/

        /*
        While sorting using age, we could also sort in reverse order and by gender.
        * Example code below :
        * .sorted(Comparator.comparing( Person::getAge).thenComparing(Person::getGender).reversed())
        * */

        List<Person> sorted_by_age = people.stream()
                .sorted(Comparator.comparing( Person::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println("Sorted people by age");
        sorted_by_age.forEach(System.out::println);


        /* All match or any match*/

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 20);

        boolean anyMatch =(people.stream()
                .anyMatch(person -> person.getAge() > 20));

        System.out.println("All match ? : " + allMatch + "\nAny match ? : "+ anyMatch);

        /*Max, Min*/

        people.stream()
                .max(Comparator.comparing(Person::getAge)).
                ifPresent(System.out::println);

        people.stream()
                .min(Comparator.comparing(Person::getAge)).
                ifPresent(System.out::println);
        /*Group by*/
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach((gender, person)-> {
                    System.out.println(gender);
                    person.forEach(System.out::println);
                }
                );

        /*Optional*/

        Optional<String> oldestFemale = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemale.ifPresent(System.out::println);

    }


    private static List<Person> getPeople (){

        return List.of(
                new Person("Alice", 18, Gender.FEMALE),
                new Person("Alibaba", 91, Gender.MALE),
                new Person("Bob", 8, Gender.MALE),
                new Person("Dory", 27, Gender.FEMALE),
                new Person("Tom", 23, Gender.MALE),
                new Person("Jerry", 21, Gender.MALE),
                new Person("Harry", 19, Gender.MALE),
                new Person("Hermione", 18, Gender.FEMALE),
                new Person("Fiona", 29, Gender.FEMALE),
                new Person("Adeline", 39, Gender.FEMALE)

        );
    }
}
