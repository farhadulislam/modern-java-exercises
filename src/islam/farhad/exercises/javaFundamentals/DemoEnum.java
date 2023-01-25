package islam.farhad.exercises.javaFundamentals;

import islam.farhad.exercises.data.Size;

import java.util.Arrays;

public class DemoEnum {

    public static void main(String[] args) {
        Size T_SHIRT_SIZE = Size.SMALL;
        Size JUMPER_SIZE = Size.MEDIUM;
        Size JACKET_SIZE = Size.LARGE;

        System.out.println(Arrays.asList(T_SHIRT_SIZE, JUMPER_SIZE, JACKET_SIZE).stream()
                .filter( e -> e.equals(Size.SMALL))
                .findFirst().get());
    }
}
