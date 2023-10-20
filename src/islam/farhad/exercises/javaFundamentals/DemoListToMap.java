package islam.farhad.exercises.javaFundamentals;

import islam.farhad.exercises.data.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoListToMap {
    public static void main(String[] args) {

        Person person1 = new Person("Amy", 23);
        Person person2 = new Person("John", 32);
        Person person3 = new Person("Tom", 19);
        Person person4 = new Person("Woody", 29);

        List<Person> personList1 = Arrays.asList(person1, person2, person3, person4);

        Map<String, Person> personMap =  personList1
                .stream()
                .collect(Collectors.toMap(s -> s.getName(), s-> s));

    }

}

