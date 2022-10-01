package islam.farhad.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoFuncInterfaceConsumer1 {

    public static void main(String... args) {

        Consumer<Integer> consumer1 = (t) -> System.out.println("Consumer " + t);

        consumer1.accept(23);

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6);
        ints.stream().forEach(consumer1);// Passing the Consumer ref directly into forEach

        ints.stream().forEach(s -> System.out.println("Printing " + s)); // or else, we could write the lambda expression

    }
}

