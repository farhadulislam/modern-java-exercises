package islam.farhad.exercises.java8commonQA;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoSortCharsFromString {
    public static void main(String[] args) {
        String string ="Thisisastring";
        String [] charsFromString = string.split("");
        Arrays.stream(charsFromString).forEach(System.out::println);
        Map<String, Long> map = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


    }
}
