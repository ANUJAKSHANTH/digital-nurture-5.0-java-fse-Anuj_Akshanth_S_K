import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b\\w{3}\\b");
        Matcher m = p.matcher("one two three for six");
        while (m.find()) System.out.println(m.group());
    }
}
