package islam.farhad.exercises.java8stream;

import java.util.List;

public class FlatMapDemo1 {
     // J Paumard, Pluralsight.
    public static void main (String ... args){

        System.out.println("flat map Demo".toUpperCase());

        Person p1 = new Person("Raisul",  34);
        Person p2 = new Person("Simrah", 10 );
        Person p3 = new Person ("Abid", 28 );
        Person p4 = new Person ("Asif", 37);
        Person p5 = new Person ("Neptune", 37 );
        Person p6 = new Person ("Macron", 45 );
        Person p7 = new Person ("Jamil", 35 );
        Person p9 = new Person ("Nayan", 34 );
        Person p8 = new Person ("Tom", 60 );


        City newcastle = new City("Newcastle", p1, p2, p3);
        City paris = new City("Paris", p4, p5, p6);
        City newYork = new City("New York", p7, p8, p9);

        List<City> cities = List.of(newcastle,paris,newYork);

        long count = cities.stream().flatMap(city -> city.getCityDwellers().stream()).count();
        System.out.println("Count :" + count);

            cities
                    .stream()
                    .flatMap(city -> city.getCityDwellers().stream())
                    .map(p -> p.getName())
                    .forEach(name -> System.out.println(name));


    }
}
