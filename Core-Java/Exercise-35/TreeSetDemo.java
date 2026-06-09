import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("dog"); ts.add("cat"); ts.add("ant");
        ts.forEach(System.out::println);
    }
}
