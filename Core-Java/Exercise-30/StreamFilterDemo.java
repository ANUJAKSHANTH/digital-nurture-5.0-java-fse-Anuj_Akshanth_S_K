import java.util.List;

public class StreamFilterDemo {
    public static void main(String[] args) {
        List<String> items = List.of("apple","bat","atom","ball");
        items.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
    }
}
