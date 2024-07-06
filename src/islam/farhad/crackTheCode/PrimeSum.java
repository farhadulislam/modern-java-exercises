package islam.farhad.crackTheCode;

public class PrimeSum {
    public static void main(String[] args) {
        findPrimeSum(10);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find two primes that sum up to the given number
    public static void findPrimeSum(int number) {
        for (int i = 3; i <= number / 2; i++) { // Start from 3 as we need primes greater than 2
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println("Primes: " + i + " + " + (number - i) + " = " + number);
                return;
            }
        }
        System.out.println("No primes greater than 2 found that sum up to " + number);
    }
}