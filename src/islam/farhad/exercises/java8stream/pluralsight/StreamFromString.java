package islam.farhad.exercises.java8stream.pluralsight;

public class StreamFromString {

    public static void main (String ... args){

        String sentence = "The quick brown fox jumps over the lazy dog";

        sentence.chars()// chars () method returns an inStream
                .mapToObj(codePoint -> Character.toString(codePoint))// mapToObj() method of intStream takes ascii code of letters as input
                .filter(letter -> !letter.equals(" "))
                .distinct()
                .sorted()
                .forEach(letter -> System.out.println(letter));
    }
}

