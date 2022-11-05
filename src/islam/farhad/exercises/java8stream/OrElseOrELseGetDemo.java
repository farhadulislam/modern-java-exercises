package islam.farhad.exercises.java8stream;

import java.util.Arrays;

public class OrElseOrELseGetDemo {
    public static void main(String[] args) {

        System.out.println(Arrays.asList("Alchemist", "Mumu", "Things fall apart").stream()
                .filter(s -> s.startsWith("Z"))
                .findFirst()
                .orElse("Not found"));

        System.out.println(Arrays.asList("Alchemist", "Mumu", "Things fall apart").stream()
                .filter(s -> s.startsWith("Z"))
                .findFirst()
                .orElseGet(() -> "Not found"));

    }
}
