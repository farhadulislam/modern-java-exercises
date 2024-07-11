package islam.farhad.crackTheCode;

import static java.lang.System.*;

public class StringConcatWithIntegerAddition {
    private static final String hello = "Hello: " + 1 + 2 * 3; //Multiplication takes precedence over addition.

    public static void main(String[] args) {

        out.println(hello);
        //out.println(3 * "5"); This works in JavaScript
    }
}
