package islam.farhad.TimeDate;

public class TimeTakenToRun {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        Thread.sleep(3000);
        System.out.println((System.nanoTime()-start)/1000000 + "ms");

    }
}
