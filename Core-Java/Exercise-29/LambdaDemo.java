import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Lambda running");
        r.run();
        Arrays.asList(1,2,3).forEach(n -> System.out.println(n * n));
    }
}
