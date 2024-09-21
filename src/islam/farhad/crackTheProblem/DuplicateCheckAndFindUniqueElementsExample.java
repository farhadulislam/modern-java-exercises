package islam.farhad.crackTheProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCheckAndFindUniqueElementsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123, 12, 45, 67, 178, 91, 14, 256, 11, 10, 14);

        hasDuplicateElement(numbers);
        getUniqueElements(numbers);
    }

    private static boolean hasDuplicateElement(List<Integer> numbers) {
        // Check for duplicates using a set and stream
        boolean hasDuplicates = numbers.stream()
                .anyMatch(num -> !new HashSet<>(numbers).add(num));

        // Output the result
        if (hasDuplicates) {
            System.out.println("The list contains duplicates.");
        } else {
            System.out.println("The list does not contain duplicates.");
        }
        return hasDuplicates;
    }

    private static List<Integer> getUniqueElements(List<Integer> list){
        // Collect unique elements into a list
        final List<Integer> uniqueNumbers = list.stream()
                .distinct()
                .collect(Collectors.toList());

        // Output the unique elements
        System.out.println("Unique elements: " + uniqueNumbers);
        return uniqueNumbers;
    }
}
