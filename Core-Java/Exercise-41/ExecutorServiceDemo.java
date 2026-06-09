import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(() -> System.out.println("Task 1"));
        ex.submit(() -> System.out.println("Task 2"));
        ex.shutdown();
        while (!ex.isTerminated()) Thread.sleep(50);
        System.out.println("All tasks done");
    }
}
