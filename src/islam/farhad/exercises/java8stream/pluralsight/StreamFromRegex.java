package islam.farhad.exercises.java8stream.pluralsight;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamFromRegex {
    public static void main (String [] args){
        String sentence = "The quick brown fox jumps over the lazy dog";

        //Inefficient and memory-expensive approach using intermediate results in an array.
        String [] words = sentence.split(" ");
        Stream<String> wordStream = Arrays.stream(words);
        long count = wordStream.count();
        System.out.println("Count : " + count);

        //Using Pattern object
        Pattern pattern = Pattern.compile(" ");
        long count2 = pattern.splitAsStream(sentence).count();
        System.out.println("Count 2 using regEx : " + count2);

    }
}
