package islam.farhad.exercises.javaFundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class IterateAndRemove {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(asList("Farhad", "farhad"));
        // The code snippet below will throw ConcurrentModification error.
       /* for( String name : names){
            if(Character.isLowerCase(name.charAt(0))){
                 names.remove(name);
            }
        }*/

        System.out.println(names);
        //Solution using iterator - this works, but more verbose than it needs to be.
       /* for(Iterator<String> iterator = names.iterator(); iterator.hasNext();){
            String name = iterator.next();
            if(Character.isLowerCase(name.charAt(0)))
                iterator.remove();
        }*/

        // Java8 ways ( jdk 1.8)
        names.removeIf( name -> Character.isLowerCase(name.charAt(0)));
        System.out.println(names);
    }
}

