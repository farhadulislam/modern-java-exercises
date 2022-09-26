package islam.farhad.exercises.classicProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    public static List<Integer> listOfPrimes;
    public static void main (String ... args){

        listOfPrimes = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();

        System.out.println(isPrime(limit));
    }

    private static boolean isPrime(int n){

        if (n < 0) return false;
        else if (n%2==0) return false;
        else return true;

    }
}
