package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.List;

public class ImperativeVsFunctionalDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,35,46,2,22,48,90);
        //Imperative
        int total = 0;
        for( int num : numbers){
            if(num % 2 ==0){
                total += num * 2;
            }
        }
        System.out.println(total);

        //Functional Style
        System.out.println(numbers.stream()
                .filter( num -> num % 2 ==0)
                .mapToInt( i -> i*2)
                .sum());
    }
}
