public class TypeCastingExample {
    public static void main(String[] args) {
        double dv = 9.78;
        int iv = (int) dv; // narrowing
        System.out.println("double " + dv + " cast to int: " + iv);
        int i = 7;
        double d = (double) i; // widening
        System.out.println("int " + i + " cast to double: " + d);
    }
}
