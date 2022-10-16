package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class AsyncParalellism {

    private static int transform(int num)  {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num * 1;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,35,46,2,22,48,90);

        numbers.parallelStream()
                .map( n -> transform(n))
                .forEach(System.out::println);

        //Calling use method which takes a Stream as arg
        use(numbers.stream());

    }

    private static void use(Stream<Integer> numbers){
        numbers
                .parallel()
                .map( n -> transform(n))
                //.sequential() // Calling sequential() will turn the entire operation into sequential. Very last one wins!
                .forEach(System.out::println);
    }
}
