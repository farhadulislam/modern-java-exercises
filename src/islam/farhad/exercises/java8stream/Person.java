package islam.farhad.exercises.java8stream;

import java.util.List;

public class Person {

    private  String name;
    private int age;
    private Gender gender;

    public Person (String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.NOT_SET;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static List<Person> getPeople (){

        return List.of(new Person("Raisul",  34),
        new Person("Simrah", 10 ),
        new Person ("Abid", 28 ),
        new Person ("Asif", 37),
        new Person ("Neptune", 37 ),
        new Person ("Macron", 45 ),
        new Person ("Jamil", 35 ),
        new Person ("Nayan", 34 ),
        new Person ("Tom", 60 ),
        new Person ("Tahsan", 40));
    }
}
