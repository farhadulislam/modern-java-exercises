package islam.farhad.exercises.java8commonQA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMostRepeatedElemanentArrayList {

    public static void main(String[] args) {

        final List<String> stringArrayList = Arrays.asList("Java", "Spring", "Microservice", "Java", "Kafka", "SpringBoot");

        findMostRepeatedElementsInAnArray(stringArrayList);
    }

    public static String findMostRepeatedElementsInAnArray(List<String> stringArrayList) {
        Map<String, Long> mapOfElementsAndTheirCounts = stringArrayList.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        Map.Entry<String, Long> entryOfElementMostRepeated = mapOfElementsAndTheirCounts.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(entryOfElementMostRepeated.getValue());
        return entryOfElementMostRepeated.getKey();
    }
}
