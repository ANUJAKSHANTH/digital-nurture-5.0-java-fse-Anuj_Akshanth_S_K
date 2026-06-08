import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Carol", 28);
        System.out.println("Bob's age: " + map.get("Bob"));
        for (var e : map.entrySet()) System.out.println(e.getKey() + " -> " + e.getValue());
    }
}
