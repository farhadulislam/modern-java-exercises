package islam.farhad.exercises.stream.pluralsight;

import islam.farhad.exercises.stream.Person;

import java.util.List;

public class ForLoopAlternative {

    public static void main(String ... args){
        // This demo is about using stream to compute a field without running for loop
        Person p1 = new Person("Raisul",  34);
        Person p2 = new Person("Simrah", 10 );
        Person p3 = new Person ("Abid", 28 );
        Person p4 = new Person ("Asif", 37);
        Person p5 = new Person ("Neptune", 37 );
        Person p6 = new Person ("Macron", 45 );
        Person p7 = new Person ("Jamil", 35 );
        Person p9 = new Person ("Nayan", 34 );
        Person p8 = new Person ("Tom", 60 );
        Person p10 = new Person ("Tahsan", 40);

        List<Person> listOfPeople = List.of (p1,p2,p3,p4, p5, p6, p7, p8);
        List<Person> listOfPeople2 = Person.getPeople();

        double avergeAgeUsingStream = listOfPeople.stream()
                .mapToInt(p -> p.getAge())
                .filter(age -> age >20)
                .average()// only works on instream; hence, used mapToInt()
                .orElseThrow();
        System.out.println("Average age using Stream: " + avergeAgeUsingStream);

        // Typical way of achieving this via for loop.
        int sum = 0;
        int count = 0;
        for (Person person : listOfPeople ){
            if (person.getAge() >20){
                sum += person.getAge();
                count += 1;
            }
        }
        double averageAge = (double)sum/count;
        System.out.println("Average age of people using for loop: " + averageAge);
    }
}

