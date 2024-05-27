package islam.farhad.exercises.classicProblems;

import islam.farhad.exercises.data.Data;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static List<Integer>  listOfPrimes = Data.Numbers.primeNumbers;
    public static void main (String ... args){
        listOfPrimes = new ArrayList<>();
        listOfPrimes.forEach( element -> isPrime(element));
        System.out.println(isPrime(listOfPrimes.get(1)));
    }

    private static boolean isPrime(int n){
        if (n < 0) return false;
        else if (n==2) return true;
        else if (n>2 && n%2==0) return false;
        else return true;
    }
    private static boolean isPrime2(int n) {
        if (n <= 1) return false; // Numbers less than or equal to 1 are not prime
        if (n == 2) return true;  // 2 is a prime number

        // Check divisibility from 2 up to n / 2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not a prime number
            }
        }
        return true; // n is a prime number
    }

    public static boolean isPrime3(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // other even numbers are not primes
        }

        // Check divisibility from 3 up to the square root of the number
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
