package islam.farhad.exercises.stream;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class MapFilterReduceDemo2 {

    public static void main (String [] args){

        String [] nameArray = new String [] {"Rob", "John", "Mike", "Sarah", "Moyazzem"};

        String [] newNameArray = stream(nameArray)
                .map(name -> name.toUpperCase())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(newNameArray));

        List<String> newNameArrayToList = Arrays.asList(newNameArray);
        List<String> newNameArrayToList21 = List.of(newNameArray);

        String [] nameGtThan4ArrayList = stream(nameArray)
                .filter(name -> name.length()>4)
                .map(nameGtThan4 -> nameGtThan4.toUpperCase())
                .toArray(String [] :: new);

        long count = stream(nameArray)
                .filter(name -> name.length()>4)
                .map(nameGtThan4 -> nameGtThan4.toUpperCase())
                .count();

        System.out.println(Arrays.toString(nameGtThan4ArrayList ));
        System.out.println(count);

        //reduce example

        String charsNameArrays = Arrays.stream(nameArray)
                .reduce("", (a,b) -> a+b);

        Integer[] numberArray = new Integer [] {2,3,4,5,6,7,8,9,0,11};

        Integer sumOfNumberArray = Arrays.stream(numberArray)
                .reduce(0, (num1, num2)-> num1 + num2);

        Integer sumOfNumberArrayUsingMethRef = Arrays.stream(numberArray)
                .reduce(Integer :: sum)
                .get();

        System.out.println("Sum using reduce:" + sumOfNumberArray);
        System.out.println("Sum using method ref:" + sumOfNumberArrayUsingMethRef);
    }
}
