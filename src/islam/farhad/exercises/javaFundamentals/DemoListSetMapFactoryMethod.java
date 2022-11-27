package islam.farhad.exercises.javaFundamentals;

import java.util.Map;
import java.util.Set;

public class DemoListSetMapFactoryMethod {

    public static void main(String[] args) {

/*
        Boolean isRunning = null;
        if (!isRunning.equals(null)) {
            System.out.println("Running");

        } else {
            System.out.println("Not Running");
        }

*/
       Set<String> setOfStrings = Set.of("Map", "Globe", "Direction");
        System.out.println(setOfStrings.stream().findFirst().get());

    }

}
