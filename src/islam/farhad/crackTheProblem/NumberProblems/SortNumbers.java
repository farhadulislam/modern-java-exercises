package islam.farhad.crackTheProblem.NumberProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        System.out.println("APPROACH 1");
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        //numbers.forEach(System.out::println);
        System.out.println("Numbers before sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("Numbers after sorting: " + numbers);

        System.out.println("APPROACH 2");
        List<Integer> numbers2 = Arrays.asList(5, 2, 8, 1, 9);
        List<Integer> sortedNumbersList = numbers2.stream().sorted().collect(Collectors.toList());
        System.out.println("Numbers after sorting: " + sortedNumbersList);

        System.out.println("APPROACH 3 : USING Integer CompareTo");
        List<Integer> numbers3 = Arrays.asList(5, 2, 8, 1, 9);
        numbers3.sort(Integer::compareTo);
        System.out.println("Numbers after sorting: " + numbers3);

        System.out.println("SORT IN DESCENDING ORDER: APPROACH 1");
        List<Integer> numbers4 = Arrays.asList(5, 2, 8, 1, 9, 13, 0, 2, 34);
        System.out.println("Numbers before sorting: " + numbers4);
        Collections.sort(numbers4, Collections.reverseOrder());
        System.out.println("Numbers after sorting: " + numbers4);

        System.out.println("SORT IN DESCENDING ORDER: APPROACH 2"); // Most efficient
        List<Integer> numbers5 = Arrays.asList(5, 2, 8, 1, 9, 13, 0, 2, 34);
        System.out.println("Numbers before sorting: " + numbers5);
        numbers5.sort(Comparator.reverseOrder());
        System.out.println("Numbers after sorting: " + numbers5);

        System.out.println("SORT IN DESCENDING ORDER: APPROACH 3");
        List<Integer> numbers6 = Arrays.asList(5, 2, 8, 1, 9, 13, 0, 2, 34);
        System.out.println("Numbers before sorting: " + numbers6);
        List<Integer> numbers6Sorted = numbers6.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Numbers after sorting: " + numbers6Sorted);







    }


}
