package islam.farhad.exercises.javaFundamentals.stringsAndChars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class DemoStringJoiner {

    public static void main(String[] args) {

        StringJoiner joiner1 = new StringJoiner(",");
        joiner1.add("Apple").add("Banana").add("Carrot");
        System.out.println(joiner1);

        StringJoiner joiner2 = new StringJoiner(",", "[", "]");
        joiner2.add("Mango").add("Orange").add("Watermelon");
        System.out.println(joiner2);

        StringJoiner joined = joiner1.merge(joiner2);
        System.out.println(joined);




    }
}
