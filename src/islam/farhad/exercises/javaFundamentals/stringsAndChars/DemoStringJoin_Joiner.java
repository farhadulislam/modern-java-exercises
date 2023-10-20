package islam.farhad.exercises.javaFundamentals.stringsAndChars;

import java.util.Arrays;
import java.util.StringJoiner;

public class DemoStringJoin_Joiner {
    public static void main(String[] args) {
        //Use String join static method
        String result = String.join(" ", new String[]{"12", "Jan", "1990"});
        System.out.println(result);
        String result2 = String.join(" ", Arrays.asList("12", "Jan", "1990"));
        System.out.println(result2);

        //StringJoiner
        String stringJoinerResult1 = new StringJoiner(" ").add("12").add("Nov").add("1991").toString();
        System.out.println(stringJoinerResult1);
    }
}
