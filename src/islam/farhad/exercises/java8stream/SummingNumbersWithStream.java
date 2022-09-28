package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.List;

public class SummingNumbersWithStream {

    public static void main (String [] args){

        List<Integer> integers = Arrays.asList(23,34,-5,5,6,7,89,-4);

        // using mapToInt() and then sum()
        Integer sum1a = integers.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum1a);
        Integer sum1b = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1b);

        //using reduce()
        Integer sum2 = integers.stream().reduce(0, (a , b) -> (a +b));
        System.out.println("Sum using reduce(): " + sum2 );

        Integer sum2b = integers.stream().reduce(0, SummingNumbersWithStream::add);
        System.out.println("Sum using reduce() and custom method: " + sum2b);

        // Using reduce() to get the max element
        Integer max1 = integers.stream().reduce(0, (a , b) -> (a > b)?a : b );
        Integer max2 = integers.stream().reduce(Integer::max).get();

        System.out.println("Max1 " + max1 + "\nMax2 " + max2);


    }
    protected static int add ( int a, int b){
        return a + b;
    }
}
