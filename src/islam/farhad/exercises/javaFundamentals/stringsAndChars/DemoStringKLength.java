package islam.farhad.exercises.javaFundamentals.stringsAndChars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoStringKLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        List<Integer> listOfStringLengths = getListOfArrayStringLengths(list);
        listOfStringLengths.forEach(System.out::println);

    }

    public static List<Integer> getListOfArrayStringLengths(List<String> list) {
        return null == list ? new ArrayList<>()
                : list.stream()
                .map(String::length)
                .toList();
    }
}
