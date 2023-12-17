package islam.farhad.crackTheCode;

public class GetMaxNumFromArray {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 67, 78};
        int maxNum = getMax(numbers);
        System.out.printf("Max num %d", maxNum);
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

