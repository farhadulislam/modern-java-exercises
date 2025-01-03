package islam.farhad.crackTheProblem.StringProblems;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate_RemoveDuplicateStrings {
    public static void main(String[] args) {
        final List<String> strings = List.of("1", "2", "2", "3", "45");
        System.out.println(removeDuplicates(strings));
        System.out.println(removeDuplicatesOfAnyType(strings, false));
    }

    static List<String> removeDuplicates(List<String> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static <T> List<T> removeDuplicatesOfAnyType(List<T> list, boolean isSortedRequired) {
        final Set<T> set = new HashSet<>(list);  // HashSet removes duplicates
        return isSortedRequired ? new ArrayList<>(set).stream().sorted().toList() : new ArrayList<>(set);       // Convert back to a list and return
    }

    public static <T> List<T> removeDuplicatesOfAnyType2(List<T> list, boolean isSortedRequired) {
        final Set<T> set = isSortedRequired ? new TreeSet <> (list) : new HashSet<>(list);  // HashSet removes duplicates
        return  new ArrayList<>(set);       // Convert back to a list and return
    }

    public static <T extends Comparable<T>> List<T> removeDuplicatesAndSortUsingStream(List<T> list) {
        return list.stream()
                .distinct()            // Remove duplicates
                .sorted()              // Sort elements
                .collect(Collectors.toList()); // Collect to a new List
    }


}
