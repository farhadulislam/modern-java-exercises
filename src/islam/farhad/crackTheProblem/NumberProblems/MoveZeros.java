package islam.farhad.crackTheProblem.NumberProblems;

import java.util.Arrays;

public class MoveZeros {

        public static void main(String[] args) {
            // Example array
            int[] nums = {0, 1, 0, 3, 12};

            // Move zeros to the end
            moveZeroes(nums);

            // Print the result
            System.out.println("Array after moving zeros: " + Arrays.toString(nums));
        }

        public static void moveZeroes(int[] nums) {
            if (nums == null || nums.length == 0) {
                return;
            }

            int nonZeroIndex = 0; // Pointer for the position of the next non-zero element

            // Traverse the array
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    System.out.println("nonZeroIndex: " + nonZeroIndex);
                    // Swap the current element with the element at nonZeroIndex
                    int temp = nums[nonZeroIndex];
                    System.out.println("temp " + temp);
                    System.out.println("nums[i] " + nums[i]);
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = temp;
                    System.out.println("After swapping");
                    System.out.println("nums[nonZeroIndex]" + nums[nonZeroIndex]);
                    System.out.println("nums[i] " + nums[i]);
                    nonZeroIndex++;
                }
            }
        }
    }

