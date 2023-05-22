package islam.farhad.exercises.javaFundamentals.stringsAndChars;

import java.util.List;
import java.util.stream.Collectors;

public class ListToString_01 {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("Apple", "Banana", "Carrot");

        String stringFromList = String.join(",", listOfStrings);
        System.out.println(stringFromList);

        String stringFromListUsingCollectors = listOfStrings.stream().collect(Collectors.joining(","));
        System.out.println(stringFromListUsingCollectors);



    }
}
