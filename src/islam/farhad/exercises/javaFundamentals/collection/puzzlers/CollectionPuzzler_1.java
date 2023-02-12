package islam.farhad.exercises.javaFundamentals.collection.puzzlers;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CollectionPuzzler_1 {
    public static void main(String[] args) {
        String [] strings = {"a", "b", "c", null};

        List<String> listOfString = Arrays.asList(strings);
        listOfString.removeIf(Objects::isNull);
        System.out.println(listOfString);
    }
}
