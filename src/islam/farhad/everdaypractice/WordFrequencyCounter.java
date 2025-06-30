package islam.farhad.everdaypractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    static Map<String, Long> countFrequency1(List<String> words) {
        Map<String, Long> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (!frequencyMap.containsKey(word)) {
                frequencyMap.put(word, 0L);
            }
            Long oldCount = frequencyMap.get(word);
            frequencyMap.put(word, oldCount + 1);

        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        System.out.println("Word frequency " + countFrequency1(Arrays.asList("Hello", "World", "Bangladesh", "Newcastle", "Toon", "Java", "Honesty", "Honesty")));
        System.out.println("Word frequency " + countFrequency2(Arrays.asList("Hello", "World", "Bangladesh", "Newcastle", "Toon", "Java", "Honesty", "Honesty")));
        System.out.println("Word frequency " + countFrequency3(Arrays.asList("Hello", "World", "Bangladesh", "Newcastle", "Toon", "Java", "Honesty", "Honesty")));
    }

    static Map<String, Long> countFrequency2(List<String> words) {
        Map<String, Long> frequencyMap = new LinkedHashMap<>();

        for (String word : words) {
            frequencyMap.merge(word, 1L, (oldValue, newValue) -> oldValue + newValue);
        }
        return frequencyMap;
    }

    static Map<String, Long> countFrequency3(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


    static LinkedHashMap<String, Long> countFrequency4(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }
}
