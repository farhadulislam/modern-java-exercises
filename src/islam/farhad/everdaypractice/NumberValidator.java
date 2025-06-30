package islam.farhad.everdaypractice;

import java.util.Scanner;

public class NumberValidator {

    public static void main(String[] args) {
        //validateInputFromConsole();

        String[] testInputs = {"123", "-5", "0", "42", "hello", "3.14", "9999"};
        validateInputs(testInputs);
    }

    private static void validateInputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        String input = scanner.nextLine();

        if (isWholeNumber1(input)) {
            System.out.println("Valid whole number entered: " + input);
        } else {
            System.out.println("Invalid input. Please enter a whole number (e.g., 1, 2, 45).");
        }

        scanner.close();
    }

    public static boolean isWholeNumber1(String input) {
        boolean answer = input.matches("\\d+");
        System.out.println(answer);
        // Check if input is made only of digits
        return answer;
    }

    /**
     * Validates if the input string is a whole number (positive integer).
     * @param input The string to validate
     * @return true if the input is a valid whole number, false otherwise
     */
    public static boolean isWholeNumber2(String input) {
        try {
            // Attempt to parse the input as an integer
            int number = Integer.parseInt(input);

            // Check if the number is positive (whole number)
            if (number < 0) {
                System.out.println("Warning: " + number + " is not a whole number. Whole numbers must be positive.");
                return false;
            }

            // Successful validation
            System.out.println("Valid whole number: " + number);
            return true;
        } catch (NumberFormatException e) {
            // This exception is thrown when the input cannot be parsed as an integer
            System.out.println("Warning: '" + input + "' is not a number. Please enter whole numbers only (1, 2, 3, etc).");
            return false;
        }
    }

    public static void validateInputs(String[] testInputs) {
        for (String input : testInputs) {
            System.out.print("Validating approach 1'" + input + "': ");
            isWholeNumber1(input);
            System.out.print("Validating approach 2 '" + input + "': ");
            isWholeNumber2(input);
        }
    }
}

