package islam.farhad.exercises.stream.pluralsight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SkippingAndLimiting {

    public static void main(String [] args){

        List<Integer> numbers = new ArrayList<>();
        numbers = IntStream.range(0,30)
                .skip(10)
                .limit(10)
                //.forEach(index -> System.out.println("Index " + index));
                .boxed()
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);


        Path path = Path.of("islam/farhad/exercises/stream/pluralsight/first-names.txt");
        try(Stream<String> lines = Files.lines(path);){

            lines.skip(20).limit(10).forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
