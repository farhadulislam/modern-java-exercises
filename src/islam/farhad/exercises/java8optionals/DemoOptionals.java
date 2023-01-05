package islam.farhad.exercises.java8optionals;

import java.util.Optional;

public class DemoOptionals {

    public static void main (String ... args){

        Optional<Human> optionalHuman1 = findHumanByName("James", 60);
        System.out.println(optionalHuman1.get().getAge());

        if(optionalHuman1.isPresent()){
            System.out.println(optionalHuman1.get().getName());
        }else{
            System.out.println("Optional empty");
        }

        Human human1 = optionalHuman1.orElse(new Human("Unknown", 0));
        optionalHuman1.map(Human::getAge)
                .orElse(0);
    }

    private static Optional<Human> findHumanByName(String name, int age){
        Human human1 = new Human(name, age);
        return Optional.ofNullable(human1);
    }
}

class Human {

    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
