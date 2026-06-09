import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Method m = String.class.getMethod("toUpperCase");
        System.out.println(m.getName() + " -> " + m.getReturnType().getSimpleName());
    }
}
