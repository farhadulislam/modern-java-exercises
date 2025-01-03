package islam.farhad.exercises.java8stream.pluralsight;

import java.util.stream.Stream;

public class StreamFromString {

    public static void main (String ... args){

        String sentence = "The quick brown fox jumps over the lazy dog";

        sentence.chars()// chars () method returns an intStream
                .mapToObj(codePoint -> Character.toString(codePoint))// mapToObj() method of intStream takes ascii code of letters as input
                .filter(letter -> !letter.equals(" "))
                .distinct()
                .sorted()
                .forEach(letter -> System.out.println(letter));

        String text = "hellohello";

        text.chars()
                .mapToObj(ch -> (char) ch) // Convert int code points to char
                .forEach(System.out::println);
        Stream.of(text.toCharArray()).distinct().forEach(System.out::println);
    }
}

