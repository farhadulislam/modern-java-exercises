package islam.farhad.exercises.javaFundamentals;

import java.util.Arrays;

public class Loop {

    public static void main(String[] args) {

        String [] names = {"Farhad", "Harry Potter", "Raisul", "Simrah"};
        int [] numbers  = {23,2,3,4,5,0,7};
        for (int i = 0; i < numbers.length; i++) {

        }
        for (int i = numbers.length - 1; i >= 0; i--) {

        }
        for (String name : names) {

        }
        Arrays.stream(names).forEach(System.out::println);
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println(Arrays.stream(numbers).average().getAsDouble());

    }
}
