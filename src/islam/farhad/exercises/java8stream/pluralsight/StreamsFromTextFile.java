package islam.farhad.exercises.java8stream.pluralsight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamsFromTextFile {

    public static void main(String [] args) throws IOException {

        Path path = Path.of("islam/farhad/exercises/java8stream/pluralsight/first-names.txt");
        try(Stream<String> lines = Files.lines(path);){

            long count = lines.count();
            System.out.println("Count (number of lines in the file) " + count);

        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
