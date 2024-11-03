package islam.farhad.FindSomething;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find2ndLargestNumFromArray {
    public static void main(String[] args) {
        List<Integer> numbersList = List.of(2, 3, 11, 23, 45, 67);

        Optional<Integer> secondLargestNumber = find2ndLargest(numbersList);
        secondLargestNumber.ifPresent(System.out::println);

    }
    private static Optional<Integer> find2ndLargest(List<Integer> numbersList) {
        if (null == numbersList)
                throw new RuntimeException();
       return numbersList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
    }
}
