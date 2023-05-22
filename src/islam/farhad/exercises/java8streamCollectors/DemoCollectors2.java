package islam.farhad.exercises.java8streamCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class DemoCollectors2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 6);

        // Collect into a set
        Set<Integer> uniqueIntegers = integers.stream().collect(Collectors.toSet());
        System.out.print(integers);
        System.out.println(uniqueIntegers);

        //Collect data into a specific collection - LinkedList for example
        LinkedList<Integer> linkedListIntegers = integers.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedListIntegers);

        //Count number of elements
        Long count = integers.stream().count();
        System.out.println("Number of elements: " + count);

        //Count number of elements that meet specific criteria
        Long countNumbersSmallerThan4 = integers.stream()
                .filter(x -> x <4)
                .collect(Collectors.counting());
        System.out.println("Number of elements (smaller than 4): " + countNumbersSmallerThan4);

        // Find min/max value element
        Integer minValueInteger = integers.stream().
                collect(Collectors.minBy(Comparator.naturalOrder()))
                .get();
        Integer maxValueInteger = integers.stream().
                collect(Collectors.maxBy(Comparator.naturalOrder()))
                .get();

        System.out.println("Min value :" + minValueInteger);
        System.out.println("Max value :" + maxValueInteger);


    }
}
