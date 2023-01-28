package islam.farhad.exercises.javaFundamentals.stringsAndChars;

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

        char[] charArrayFromString = word.toCharArray();
        System.out.println();
        for( int i =0; i<charArrayFromString.length; i++){
            System.out.println(" " + charArrayFromString[i]);
        }
        //Convert char [] array to List and then call stream on it
        Arrays.asList(charArrayFromString).stream().forEach(System.out::println);

        String [] wordSplit = word.split(" ");
        Stream.of(wordSplit).map(s -> s.toUpperCase()).forEach(System.out::println);

        String sentence = "Independence is greatest freedom a nation can ever have";
        String [] sentenceSplit = sentence.split(" ");
        Arrays.stream(sentenceSplit).forEach(System.out::println);

        System.out.println("Using custom method to convert String to character Array");
        stringToCharArray("aeiou");
        System.out.println("Using String instance method");
        System.out.println("ijklm".toCharArray());

        //character array to String.
        String computation = "Computation";
        char [] computationToArray = computation.toCharArray();
        System.out.println(computationToArray);
        String charArrayToComputation1 = new String(computationToArray);
        System.out.println(charArrayToComputation1);


        }



    public static char [] stringToCharArray(String string) {

        // create an array of characters. Length is vowels' length
        char[] charArray = new char[string.length()];

        // loop to iterate each characters in the 'vowels' string
        for (int i = 0; i < string.length(); i++) {
            // add each character to the character array
            charArray[i] = string.charAt(i);
        }

        // print the array
        System.out.println(Arrays.toString(charArray));
        return charArray;
    }
}
