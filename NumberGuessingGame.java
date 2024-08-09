import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Random rand = new Random();
            int numberToGuess = rand.nextInt(100);
            int numberOfTries = 0;
            int guess;

            while (true) {
                System.out.println("Guess a number between 1 and 100:");
                guess = input.nextInt();
                numberOfTries++;

                if (guess > numberToGuess) {
                    System.out.println("Your guess is too high!");
                } else if (guess < numberToGuess) {
                    System.out.println("Your guess is too low!");
                } else {
                    System.out.println("You win!");
                    System.out.println("The number was " + numberToGuess);
                    System.out.println("It took you " + numberOfTries + " tries.");
                    break;
                }
            }
        } finally {
            input.close(); 
        }
    }
}
