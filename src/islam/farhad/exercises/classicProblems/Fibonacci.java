package islam.farhad.exercises.classicProblems;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(String.format("Fibonacci recursive %d", fibonacci_recursive(13)));
    }
    public static int fibonacci_recursive(int num){
        if(num<=1)
            return num;
        else
            return ((num-1)+ (num-2));
    }
}
