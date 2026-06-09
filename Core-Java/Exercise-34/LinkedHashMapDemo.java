import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("one",1); map.put("two",2); map.put("three",3);
        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
