import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> maybe = Optional.ofNullable(null);
        System.out.println(maybe.orElse("default"));
        Optional<String> present = Optional.of("hello");
        present.ifPresent(System.out::println);
    }
}
