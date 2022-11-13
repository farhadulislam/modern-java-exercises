package islam.farhad.exercises.javaFundamentals;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap1 {
    public static void main(String[] args) {


        Map<String, Integer> hashMap1 = new HashMap<>();

        hashMap1.put( "Aziz", 1110);
        hashMap1.put( "Tarik", 2220);
        hashMap1.put( "Abid", 3330);
        hashMap1.put( "Hassan", 4440);
        hashMap1.put("Dummy", 0);

        hashMap1.forEach( (k, v ) -> System.out.println(k + " - " + v));

        hashMap1.remove("Dummy");
        hashMap1.forEach( (k, v ) -> System.out.println(k + " - " + v));
        hashMap1.putIfAbsent("Farhad", 2345);
        hashMap1.forEach( (k, v ) -> System.out.println(k + " - " + v));

        System.out.println("Contains key Dummy : " + hashMap1.containsKey("Dummy"));
        System.out.println("Contains value 2345 : " + hashMap1.containsValue("2345"));
/*
        System.out.println("Keys");
        hashMap1.keySet().forEach(System.out::println);
        System.out.println("Values");
        hashMap1.values().forEach(System.out::println);*/

        for (Map.Entry<String, Integer>  entry : hashMap1.entrySet()){
            System.out.println(entry);

        }
    }
}
