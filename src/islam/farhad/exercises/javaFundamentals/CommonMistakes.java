package islam.farhad.exercises.javaFundamentals;

import java.util.*;

public class CommonMistakes {

    public static void main(String[] args) {
        avoidConcurrentModification();
    }

    public static void avoidConcurrentModification(){
        List<String> words = new ArrayList<>(Arrays.asList("Mango", "Jackfruit"));
        Collections.addAll( words, "apple", "banana", "carrot", "lemon", "kiwi", "orange", "Melon");
        System.out.println(words);
        words.removeIf(word -> word.equals("apple"));
        System.out.println(words);

        /*Using iterator*/
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            String word = iterator.next();
            if(word.equals("Melon")){
                iterator.remove();
            }
        }
        System.out.println(words);


    }

}
