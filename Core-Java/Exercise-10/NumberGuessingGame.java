import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        int target = rnd.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = -1;
        System.out.println("Guess the number between 1 and 100");
        while (guess != target) {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            if (guess < target) System.out.println("Too low");
            else if (guess > target) System.out.println("Too high");
            else System.out.println("Correct!");
        }
        sc.close();
    }
}
