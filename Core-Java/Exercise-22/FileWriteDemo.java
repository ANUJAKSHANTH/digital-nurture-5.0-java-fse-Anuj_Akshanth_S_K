import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write: ");
        String s = sc.nextLine();
        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write(s + System.lineSeparator());
        }
        System.out.println("Written to output.txt");
        sc.close();
    }
}
