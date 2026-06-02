import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // number between 1 to 100
        int guess = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high! Try lower.");
            } 
            else if (guess < number) {
                System.out.println("Too low! Try higher.");
            } 
            else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        sc.close();
    }
}