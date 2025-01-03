package islam.farhad.crackTheProblem.DuplicateProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCheckAndFindUniqueElementsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123, 12, 45, 67, 178, 91, 14, 256, 11, 10, 14);
        List<String> names = Arrays.asList("Abid", "Abid", "Raisul", "Munna", "Turjo");

        System.out.println("CONTAINS DUPLICATE: " + hasDuplicateElement(numbers));
        getUniqueElements(numbers).forEach(System.out::println);


        System.out.println("CONTAINS DUPLICATE: " + hasDuplicateElement(names));
        getUniqueElements(names).forEach(System.out::println);
    }

    private static <T> boolean hasDuplicateElement(List<T> numbers) {
        return numbers.stream()
                .anyMatch(num -> !new HashSet<>(numbers).add(num));
    }

    private static <T> List<T> getUniqueElements(List<T> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
