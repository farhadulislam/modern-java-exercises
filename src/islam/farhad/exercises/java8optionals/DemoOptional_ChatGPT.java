package islam.farhad.exercises.java8optionals;

import java.util.Optional;

public class DemoOptional_ChatGPT {
    public static void main(String[] args) {
        // Create an empty Optional
        Optional<String> empty = Optional.empty();
        System.out.println("Empty Optional: " + empty);

        // Create an Optional with a non-null value
        String name = "John";
        Optional<String> opt = Optional.of(name);
        System.out.println("Optional with value: " + opt);

        // Create an Optional with a null value
        // This will throw a NullPointerException
        // Optional<String> opt = Optional.of(null);

        // Create an Optional that may contain a null value
        Optional<String> optNull = Optional.ofNullable(name);
        System.out.println("Optional with null value: " + optNull);
        optNull = Optional.ofNullable(null);
        System.out.println("Empty Optional with null value: " + optNull);

        // Check if an Optional contains a value
        if (opt.isPresent()) {
            System.out.println("Optional contains value: " + opt.get());
        } else {
            System.out.println("Optional is empty");
        }

        // Use the orElse method to return a default value
        String defaultName = opt.orElse("[unknown]");
        System.out.println("Default value: " + defaultName);

        // Use the orElseGet method to return a default value
        String defaultName2 = optNull.orElseGet(() -> "[unknown]");
        System.out.println("Default value with orElseGet: " + defaultName2);

        // Use the orElseThrow method to throw an exception if the Optional is empty
        try {
            String exceptionName = empty.orElseThrow(() -> new Exception("Optional is empty"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Use the map method to transform the value in the Optional
        Optional<String> upperCaseOpt = opt.map(String::toUpperCase);
        System.out.println("Optional with uppercase value: " + upperCaseOpt);
    }
}
