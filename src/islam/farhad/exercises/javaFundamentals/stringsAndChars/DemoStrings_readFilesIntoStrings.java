package islam.farhad.exercises.javaFundamentals.stringsAndChars;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStrings_readFilesIntoStrings {
    public static void main(String[] args) throws IOException {
        // Read file into string
        String contents = new String(Files.readAllBytes(
                Paths.get("src/islam/farhad/exercises/data/alice.txt")), StandardCharsets.UTF_8);
        //Split turns String into a String [] array
        //Split into words; non-letters are delimiters
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        //Now we are ready to iterate:
        int count = 0;
        for (String w : words) {
            if (w.length() > 5) count++;
        }
        System.out.println("CONTENTS: \n" + contents + "\nWORDS: " + words);
        System.out.println(count);
        /*It is hard to parallelize the code written above.
        That’s where the Java 8 bulk operations come in.
        In Java 8, the same operation looks like this:*/
        long count2 = words.stream().filter(w -> w.length() > 5).count();
        System.out.println(count2);
        System.out.println(Stream.of(words).count());
    }
}
