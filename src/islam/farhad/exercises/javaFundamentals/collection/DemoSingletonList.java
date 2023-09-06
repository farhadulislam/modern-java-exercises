package islam.farhad.exercises.javaFundamentals.collection;

import java.util.Collections;
import java.util.List;

public class DemoSingletonList {
    public static void main(String[] args) {
        //Immutable
        List<String> singletonList = Collections.singletonList("Singleton List");
        try {
            singletonList.add("Another element");

        } catch (UnsupportedOperationException e) {
            System.out.println("Can't add to singleton list");
        }

        System.out.println(singletonList);
    }
}
