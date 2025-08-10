package islam.farhad.exercises.java8array;

import java.util.Arrays;

public class ArrayUtils {
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


    }

    private static void printPrimitiveArrayElements(int[] nums) {
        System.out.println("PRINTING ...  " +"input: " + nums +", length: " + nums.length);
        for (int num : nums) {
            System.out.println("");
            System.out.printf("Element: %s", num);
        }
        System.out.println("");
    }
}
