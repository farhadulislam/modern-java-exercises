package islam.farhad.exercises.classicProblems.recursion;

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println("Start");
        printLine(5);
        System.out.println("End");
       // printForever("Hello");
        System.out.println(factorial(5));
        System.out.println(fibbonacci(5));
        displayBinary(10);
    }

    public static void printLine(int n) {
        if (n > 0) {
            System.out.println();
            printLine(n - 1);
        }
    }
    public static void printForever(String s) {
        System.out.println();
        printForever(s);

    }

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        return  n * factorial(n - 1);
    }

    public static int fibbonacci (int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return  fibbonacci(n-1) + fibbonacci(n-2);
    }

    public static void  displayBinary (int n) {
        if (n > 0) {
            displayBinary(n/2);
            System.out.print(n %2);
        }
        System.out.println();

    }

    public static void getBinary (int n) {
        StringBuilder sb = new StringBuilder();
        if (n > 0) {
            getBinary(n/2);
            System.out.print(n %2);
        }
        System.out.println();
    }

}
