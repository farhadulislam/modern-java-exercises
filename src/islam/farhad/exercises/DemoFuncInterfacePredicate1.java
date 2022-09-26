package islam.farhad.exercises;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class DemoFuncInterfacePredicate1 implements Predicate<Integer> {

    public static void main (String ... args){
        //Old Fashioned way
        Predicate<Integer> predicate1 = new DemoFuncInterfacePredicate1();
        predicate1.test(23); // Calling overriden method test() here

        //Java8 way - implements keyword can be omiited.
        Predicate<Integer> predicate2 = t -> t%2 ==0; // lambda exp with boolean return type
        System.out.println(predicate2.test(33));

         Stream.of(2,3,4,5,6,7,8,9,11,12,24,56,78)
                 .filter(predicate2)
                 .forEach(i -> System.out.println("Printing even: " + i));
    }

    @Override
    public boolean test(Integer integer) {

        return integer %2 ==0;
    }
}
