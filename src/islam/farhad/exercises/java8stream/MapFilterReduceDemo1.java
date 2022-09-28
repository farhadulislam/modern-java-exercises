package islam.farhad.exercises.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapFilterReduceDemo1 {

    public static void main (String [] args){

        List<Integer> listOfNumbers = Arrays.asList(23, 24, 1, 0, 9, 78, 87, 99);
        List<String> words = Arrays.asList("Java", "Spring Boot", "Hibernate", "Junit");

        int sum = listOfNumbers.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum : " + sum);

        //get sum using Funtional interface signature or lamdbda expr

        Integer sumUsingReduce = listOfNumbers.stream().reduce(0, (a,b)-> (a+b));
        System.out.println("Sum using reduce and lamda " + sumUsingReduce);
        Optional<Integer> sumUsingReduceMethodRef = listOfNumbers.stream().reduce(Integer::sum);
        // Used get() to unwrap Integer from Optional.
        System.out.println("Sum using reduce and Method ref " + sumUsingReduceMethodRef.get());

        Integer numsMultiplied = listOfNumbers.stream().reduce(0, (a,b) -> a *b);
        Integer maxValue = listOfNumbers.stream().reduce(0, ((a,b) -> a>b ? a : b));
        Integer maxValueUsingMehtodRef = listOfNumbers.stream().reduce(Integer::max).get();

        System.out.println("Nums multiplied: " + numsMultiplied +
                "\n" + "Max value " + maxValue +
                "\n" + "Max Value using method ref : " + maxValueUsingMehtodRef);

        String longestWord = words.stream().reduce((word1,word2)->word1.length()>word2.length()? word1:word2).get();
        System.out.println("Longest word : " + longestWord);


    }
}
