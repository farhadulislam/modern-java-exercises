package islam.farhad.crackTheCode;

import java.util.Arrays;

public class GetMaxNumFromArray {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 67, 78, 78};
        int maxNum = getMax(numbers);
        System.out.printf("Max num %d", maxNum);
        //
        System.out.println(getMaxNumUsingStream(null));
    }

    private static int getMaxNumUsingStream(int[] numbers) {
       return null == numbers || numbers.length == 0 ? -1 : Arrays.stream(numbers).max().getAsInt();
    }

    private static int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max)
                max = num;
        }
        return max;
    }
}

