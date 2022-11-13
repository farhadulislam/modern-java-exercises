package islam.farhad.exercises.javaFundamentals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {
    public static void main(String[] args) {

        Set<String> numbersSet = new HashSet<>();
        numbersSet.add("One");
        numbersSet.add("Two");
        numbersSet.add("Three");
        numbersSet.add("Four");

        Iterator<String> numbersSetIterator = numbersSet.iterator();
        /*while(numbersSetIterator.hasNext()){
            System.out.println(numbersSetIterator.next());
        }*/

        numbersSet.stream().forEach(System.out::println);

        int [] numbersArray = {1, 2, 1,3,4,5,6,7};
        Set<Integer> integersSet = new HashSet<>();
        for(int i = 0; i <numbersArray.length; i ++) {
            integersSet.add(numbersArray[i]);
        }
        integersSet.stream().forEach(System.out::println);

        Set<Integer> integerSet2 = new LinkedHashSet<>();
        integerSet2.add(100);
        integerSet2.add(200);
        integerSet2.add(300);
        integerSet2.add(50);

        integerSet2.stream().forEach(System.out::println);

    }
}
