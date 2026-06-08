import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple"); set.add("banana"); set.add("apple");
        System.out.println("Set contains apple: " + set.contains("apple"));
        System.out.println("Elements:");
        for (String s : set) System.out.println(s);
    }
}
