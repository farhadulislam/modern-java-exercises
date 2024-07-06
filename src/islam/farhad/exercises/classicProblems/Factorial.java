package islam.farhad.exercises.classicProblems;

import java.math.BigInteger;

public class Factorial {

    public static void main(String... args) {

        System.out.println("Factorial Demo");

        long answer = fact(3);
        print(answer);
        BigInteger bigInteger = factUsingBigInteger(20);
        print(bigInteger);
    }

    private static long fact(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static BigInteger factUsingBigInteger(int num) {

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void print(Object obj) {
        System.out.println(obj.toString());
    }
}
