package islam.farhad.exercises.javaFundamentals.collection;

import java.util.Collections;
import java.util.List;

public class DemoSingletonList {
    public static void main(String[] args) {
        //Immutable
        List<String> singletonList = Collections.singletonList("Singleton List");
        System.out.println(singletonList);
    }
}
