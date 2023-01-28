package islam.farhad.exercises.javaFundamentals.sorting;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValuesByChatGPT {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 3);
        map.put("C", 2);
        map.put("D", 5);
        map.put("E", 4);

        // Sort the HashMap by values in descending order
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        // Print the sorted HashMap
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }




}




