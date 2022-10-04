package islam.farhad.exercises.javaMultiThreading;

public class Main {
    public static void main(String[] args) {

        for (int i =0; i<5; i++){
            MultiThreadExample1 myThread = new MultiThreadExample1(i);
            myThread.start();
        }
    }
}
