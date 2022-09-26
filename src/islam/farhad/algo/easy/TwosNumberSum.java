package islam.farhad.algo.easy;
import java.util.*;

public class TwosNumberSum {

        protected static int[] twoNumberSum_sol1(int[] array, int targetSum) {
            // Write your code here.
            //int [] newArray = {};
            for (int i=0; i<array.length;i++){
                int firstNumber = array[i];
                for(int j=i+1; j<array.length; j++) {
                    int secondNumber = array[j];
                    if (firstNumber + secondNumber == targetSum){
                        return new int []{firstNumber, secondNumber};
                    }
                }
            }
            return new int[0];
        }
}

