package islam.farhad.crackTheCode;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeIncrement  {
    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(()-> count.getAndIncrement());
        Thread thread2 = new Thread(()-> count.getAndIncrement());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Final count: " + count);
    }
}
