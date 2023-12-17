package islam.farhad.crackTheCode;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumOfTimesWordAppears {
    public static void main(String[] args) {
        String sentence = "Biryani Sandwich Burger Burger Biryani Pizza ";
        String wordToFindCountOf = "Biryani";

        //getCountOfTheWord(sentence, "");

        // Better solution
        Arrays.stream(sentence.split(" "))
                .collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + " " + count));

        //long count = sentence.chars().filter(c -> c == wordToFindCountOf).count();
        //System.out.println(count);
    }
    //WARNING : faulty code; needs fixing.
    private static void getCountOfTheWord(String sentence, String wordToFindCountOf) {
        int count = 0;
        int index = sentence.indexOf(wordToFindCountOf);
        while (index >= 0) {
            count++;
            index = sentence.indexOf(wordToFindCountOf, index + 1);
            System.out.println("index : " + index);
        }
        System.out.println(count);
    }
}
