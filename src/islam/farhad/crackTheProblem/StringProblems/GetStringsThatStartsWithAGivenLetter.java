package islam.farhad.crackTheProblem.StringProblems;

import java.util.*;
import java.util.stream.Collectors;

public class GetStringsThatStartsWithAGivenLetter {
    public static void main(String[] args) {
        List<String> emptyList = List.of();
        //System.out.println("Empty list result: " + getListOfWordsThatStartsWithAGivenCharacter(emptyList, 'A'));

        // Test with list containing null and empty strings
        List<String> mixedList = Arrays.asList("Apple", null, "", "Banana", "Apricot");
        System.out.println("Filtered result: " + getListOfWordsThatStartsWithAGivenCharacter(mixedList, 'A'));

        //
        List<String> names = List.of("Apple", "Apricot", "Banana", "Avocado", "apple");
        System.out.println(getListOfWordsThatStartsWithAGivenCharacter(names, 'A'));

    }

    private static List<String> getListOfWordsThatStartsWithAGivenCharacter(List<String> stringList, Character prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        if (stringList == null || stringList.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }



        return stringList.stream()
                .filter(Objects:: nonNull)
                .filter(str -> !str.isEmpty() && str.charAt(0) == prefix)
                .collect(Collectors.toList());
    }
}
