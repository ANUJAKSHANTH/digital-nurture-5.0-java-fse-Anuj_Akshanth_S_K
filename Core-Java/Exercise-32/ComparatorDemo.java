import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana"); list.add("apple"); list.add("pear");
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
