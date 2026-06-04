import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Choose operation (+ - * /): ");
        String op = sc.next();
        double res = 0;
        switch (op) {
            case "+": res = a + b; break;
            case "-": res = a - b; break;
            case "*": res = a * b; break;
            case "/": res = b != 0 ? a / b : Double.NaN; break;
            default: System.out.println("Unknown op"); System.exit(1);
        }
        System.out.println("Result: " + res);
        sc.close();
    }
}
