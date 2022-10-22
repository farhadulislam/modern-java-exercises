
package islam.farhad.exercises.javaFundamentals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class APlaceForQuickPractice {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(0, 1, 1, 2,2,4,5,9, 3,4,5,6);

        //use of external iterators
        for (int i =0; i<integers.size(); i++){
            System.out.println(integers.get(i));
        }

        //use of external iterators
        for (int i : integers){
            System.out.println(i);
        }
        System.out.println("User of lambda expression");
        integers.forEach(i -> System.out.println(i));
        integers.forEach(System.out::println);

        integers.stream().sorted().forEach(System.out::println);
        integers.stream().distinct().sorted().forEach(System.out::println);
        int sum = integers.stream().filter(i ->i>0).map(num -> num *2).reduce(0, (a, b) -> (a+b));
        System.out.println(sum);

        Thread th = new Thread (()-> System.out.println("This is a thread"));
        th.start();
    }
}

