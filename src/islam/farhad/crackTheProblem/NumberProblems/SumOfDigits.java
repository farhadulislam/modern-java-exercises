package islam.farhad.crackTheProblem.NumberProblems;

import java.util.Scanner;

public class SumOfDigits {


    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(Math.abs(number)); // Use absolute value to handle negative numbers

        // Print the result
        System.out.println("The sum of the digits is: " + sum);
    }

    // Method to calculate the sum of digits
    public static int calculateSumOfDigits(int num) {
        if (num == 1)
            return 1;
        int sum = 0;
        while (num > 1) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10;       // Remove the last digit
        }
        return sum;
    }
}

