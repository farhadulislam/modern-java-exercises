package islam.farhad.exercises.fundametals;

import java.util.*;

public class SortingMapUsingLambda {
    public static void main(String [] args){

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Two", 2);
        map1.put("One", 1);
        map1.put("Three", 3);
        map1.put("Five", 5);


        //create a List of type Entry<String, Integer>, and pass in map1.entry() to constructor.
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map1.entrySet());

        /**********Sort pre-java8 way ******************/
        /*Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

        // The above could be rewritten using lambda expression
        // That is - implement anonymous method compare of Comparator interface as 2nd argument into Collections.sort()
        // Note that compare() method itself uses compareTo() method of Comparable interface.
        // Comparable interface -> compareTo()
        // Comparator interface -> compare()

        /**********SORT using lambda exp. ******************/
        Collections.sort(entryList, (o1,o2)-> o1.getKey().compareTo(o2.getKey()));
        for(Map.Entry<String, Integer> entry : entryList){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        /**********SORT using Stream API ******************/
        map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
