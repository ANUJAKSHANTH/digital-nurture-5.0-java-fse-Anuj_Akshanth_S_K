import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names (empty to stop):");
        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) break;
            names.add(s);
        }
        System.out.println("Names entered:");
        for (String name : names) System.out.println(name);
        sc.close();
    }
}
