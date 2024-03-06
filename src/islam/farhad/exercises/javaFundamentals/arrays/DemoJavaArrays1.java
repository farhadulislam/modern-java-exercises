package islam.farhad.exercises.javaFundamentals.arrays;

import java.util.Arrays;

public class DemoJavaArrays1 {
    public static void main(String[] args) {

        int[] intArrays = {1, 2, 3, 4, 5};
        printArrayElements(intArrays);

    }

    private static void printArrayElements(int [] intArrays) {
        for(int i = 0; i < intArrays.length;i++){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(intArrays));
    }

}
