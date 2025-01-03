package islam.farhad.crackTheProblem.DuplicateProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFinder {
    public static void main(String[] args) {
        final List<Integer> listOfIntegersContainingDuplicates = Arrays.asList(2, 3,45,6,7,1,2);
        System.out.println(containsDuplicate(listOfIntegersContainingDuplicates));
    }

    private static <T> boolean containsDuplicate(List<T> list) {
        final Set<T> integerSet = new HashSet<>(list);
        System.out.println("INPUT" + list);
        System.out.println("OUTPUT(unique)" + integerSet);
        return list.size() == integerSet.size();

    }

    public static <T> boolean containsDuplicate2(List<T> list) {
        Set<T> set = new HashSet<>();
        for (T item : list) {
            if (!set.add(item)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates
    }

    public static <T> boolean containsDuplicate3(List<T> list) {
        Set<T> set = new HashSet<>();
        for (T item : list) {
            if(list.contains(item))
                return true;
          set.add(item);
        }
        return false; // No duplicates
    }

    // Optional: Return the duplicates
    public static <T> Set<T> findDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        Set<T> duplicates = new HashSet<>();
        for (T item : list) {
            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }
        return duplicates;
    }
}
