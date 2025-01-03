package islam.farhad.crackTheProblem.NumberProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersThatStartsWithAParticularDigit {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123, 12, 45, 67, 178, 91, 14, 256, 11, 10);

        // Sorting the numbers that start with '1'
        sortNumbersIfStartsWithGivenDigit(numbers, "6");

    }

    private static List<Integer> sortNumbersIfStartsWithGivenDigit(List<Integer> numbers, String digit) {
        final List<Integer> sortedNumbers = numbers.stream()
                .filter(num -> String.valueOf(num).startsWith(digit))
                .sorted()
                .collect(Collectors.toList());

        // Output the sorted numbers
        System.out.println(sortedNumbers);

        return sortedNumbers;
    }

}
