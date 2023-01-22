package islam.farhad.algo.easy;

import java.util.List;
public class Subsequence {
        public static boolean isValidSubsequence_sol1(List<Integer> array, List<Integer> sequence) {
            // Write your code here.
            int arrayIndex = 0;
            int seqIndex = 0;

            while(arrayIndex < array.size() && seqIndex < sequence.size()){
                if (array.get(arrayIndex).equals(sequence.get(seqIndex))){
                    seqIndex++;
                }
                arrayIndex++;
            }

            return seqIndex == sequence.size();
        }

}
