package islam.farhad.exercises.javaFundamentals;

import java.util.StringJoiner;

public class DemoJavaStringJoiner {

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
