package islam.farhad.exercises.javaFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStrings {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Singapore", "Tokyo", "Bangkok", "Dhaka");

        String asianCities = cities.stream().collect(Collectors.joining("-", "{", "}"));
        String asianCities2 = cities.stream().collect(Collectors.joining("-"));
        System.out.println(asianCities);
        System.out.println(asianCities2);

        //Common String methods
        String word = "Independence";
        System.out.println(word.charAt(0));
        System.out.println(word.toCharArray());
        System.out.println(word.indexOf('e'));

        char[] wordArray = word.toCharArray();
        System.out.println();
        for( int i =0; i<wordArray.length; i++){
            System.out.println(" " + wordArray[i]);
        }
        //Convert char [] array to List and then call stream on it
        Arrays.asList(wordArray).stream().forEach(System.out::println);

        String [] wordSplit = word.split(" ");
        Stream.of(wordSplit).map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
