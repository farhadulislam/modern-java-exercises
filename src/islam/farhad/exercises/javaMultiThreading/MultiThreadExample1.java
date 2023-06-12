package islam.farhad.exercises.javaMultiThreading;

public class MultiThreadExample1 extends Thread {

    private int threadNumber;

    MultiThreadExample1(int threadNumber) {
        this.threadNumber = threadNumber;
        System.out.println(this.getName().toString());
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from " + threadNumber);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
