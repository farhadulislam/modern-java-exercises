package islam.farhad.crackTheCode;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureWithConcurrency {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(()-> task1());
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(()-> task2());
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(()-> task3());
        CompletableFuture<Integer> result = future1
                .thenCombine(future2, Integer:: sum)
                .thenCombine(future3, Integer:: sum);

        CompletableFuture<Integer> result2 = CompletableFuture.allOf(future1, future2, future3)
                .thenApply(dummy -> future1.join() + future2.join() + future3.join());

        int finalResult = result.join();
        int finalResult2 = result2.join();
        System.out.println("Final result: " + finalResult);
        System.out.println("Final result 2: " + finalResult2);

    }
    private static int task1(){
        return 1;
    }
    private static int task2(){
        return 1;
    }
    private static int task3(){
        return 1;
    }
}
