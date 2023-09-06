package islam.farhad.algo.easy;

import java.util.List;

public class Main_Algo_Easy {

    public static void main (String ... args){

        int[] intArray = new int[0];
        System.out.println(intArray);

        System.out.println("Main Program Starting ...");
        int [] array = {2, 3, 4, 5, 6, 0, 11, 12};
        int targetSum = 23;
        System.out.println(TwosNumberSum.twoNumberSum_sol1(array, 13));
        System.out.print("Is valid Subsequence : ");
        System.out.println(Subsequence.isValidSubsequence_sol1(List.of(2,3,4,5,6,7,9,0), List.of(3,4,5,6)));

    }
}
