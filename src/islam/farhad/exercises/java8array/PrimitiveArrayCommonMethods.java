package islam.farhad.exercises.java8array;

import java.util.Arrays;
import java.util.Comparator;

public class PrimitiveArrayCommonMethods {
    public static void main(String[] args) {

        int[] ids = new int[10];

        for (int i = 0; i < ids.length; i++) {
            ids[i] = i*i;
        }
        printPrimitiveArrayElements(ids);


        // COPYING ARRAY ELEMENTS
        int[] nums = {1, 2, 3, 5, 7, 6};
        int[] copy_nums = Arrays.copyOf(nums, 10);

        printPrimitiveArrayElements(nums);
        printPrimitiveArrayElements(copy_nums);

        // COPYING ARRAY ELEMENTS USING SYSTEM ARRAY COPY : only copies the elements
        int[] src = {1990,1991, 1993, 1995, 1997, 1996};
        int[] dest = new int[3];

        System.arraycopy(src, 0, dest, 0, 3);
        printPrimitiveArrayElements(dest);

        //CLONING
        int [] cloned  = src.clone();
        printPrimitiveArrayElements(cloned);

        int[] messy_array = {30, 12, 3, 4, 100, 202, 5, 44};
        System.out.println("Unsorted array");
        printPrimitiveArrayElements(messy_array);
        Arrays.sort(messy_array);
        System.out.println("Sorted array");
        printPrimitiveArrayElements(messy_array);

        //String is object type btw : used for demo here only to take advantage of Comparator of String class

        String [] another_messy_array = {"Thailand", "Bangladesh", "UAE"};
        Arrays.sort(another_messy_array, Comparator.reverseOrder());
        System.out.println("Sorted array");
        printPrimitiveArrayElements(another_messy_array);


    }

    private static void printPrimitiveArrayElements(int[] nums) {
        System.out.println("PRINTING ...  " +"input: " + nums +", length: " + nums.length);
        for (int num : nums) {
            System.out.println("");
            System.out.printf("Element: %s", num);
        }
        System.out.println("");
    }

    private static void printPrimitiveArrayElements(String [] nums) {
        System.out.println("PRINTING ...  " +"input: " + nums +", length: " + nums.length);
        for (String num : nums) {
            System.out.println("");
            System.out.printf("Element: %s", num);
        }
        System.out.println("");
    }
}
