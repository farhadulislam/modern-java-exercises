package islam.farhad.crackTheProblem.StringProblems;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfString {

    public static void main(String[] args) {
        System.out.println(reverseEachWord("Hello, Farhad"));
    }

    public static String reverseEachWord(String s) {
        return Stream.of(s.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
