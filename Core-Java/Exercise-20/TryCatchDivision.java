import java.util.Scanner;

public class TryCatchDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: "); int a = sc.nextInt();
        System.out.print("b: "); int b = sc.nextInt();
        try {
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero");
        }
        sc.close();
    }
}
