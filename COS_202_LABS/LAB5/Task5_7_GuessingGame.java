import java.util.Scanner;

public class Task5_7_GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secret = (int) (Math.random() * 100) + 1;
        int attempts = 0, guess;
        System.out.println("I am thinking of a number from 1 to 100.");
        do {
            System.out.print("Your guess: ");
            guess = in.nextInt();
            attempts++;
            if (guess > secret) System.out.println("Too high!");
            else if (guess < secret) System.out.println("Too low!");
        } while (guess != secret);
        System.out.println("Correct! The number was " + secret + ". Attempts: " + attempts);
        in.close();
    }
}
