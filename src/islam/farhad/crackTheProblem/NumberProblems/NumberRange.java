package islam.farhad.crackTheProblem.NumberProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberRange {
    public static void main(String[] args) {
        System.out.println(getListOfNumbersUsingForLoop(10, 20));
        System.out.println(getListOfNumbersUsingIntStream(20, 30));
        System.out.println(getListOfNumbersUsingIntStreamRangeClosed(20, 30));
        System.out.println(getListOfNumbersUsingIntStreamAndIterate(40, 5));
    }

    private static List<Integer> getListOfNumbersUsingForLoop(int start, int end) {
        final List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(i);
        }
        return result;
    }
    private static List<Integer> getListOfNumbersUsingIntStream(int start, int end) {
       return IntStream.range(start, end).boxed().collect(Collectors.toList());
    }
    private static List<Integer> getListOfNumbersUsingIntStreamRangeClosed(int start, int end) {
        return IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());
    }
    private static List<Integer> getListOfNumbersUsingIntStreamAndIterate(int start, int limit) {
        return IntStream.iterate(start,  i -> i+1).limit(limit).boxed().collect(Collectors.toList());
    }
}
