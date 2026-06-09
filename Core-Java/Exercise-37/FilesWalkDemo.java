import java.nio.file.Files;
import java.nio.file.Path;

public class FilesWalkDemo {
    public static void main(String[] args) throws Exception {
        Files.walk(Path.of(".")).limit(10).forEach(p -> System.out.println(p.toString()));
    }
}
