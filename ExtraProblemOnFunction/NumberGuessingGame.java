import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Function to generate a random guess within a given range
    public static int generateGuess(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Function to receive feedback from the user
    public static String getFeedback() {
        Scanner scanner = new Scanner(System.in);
        String feedback;
        do {
            System.out.print("Is the guess correct, too high, or too low? (correct/high/low): ");
            feedback = scanner.nextLine().toLowerCase();
        } while (!feedback.equals("correct") && !feedback.equals("high") && !feedback.equals("low"));
        return feedback;
    }

    // Main game function to start the guessing game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100 and I will try to guess it.");
        System.out.println("You will need to tell me if my guess is correct, too high, or too low.");

        int lowerBound = 1;
        int upperBound = 100;
        String feedback = "";
        int guessCount = 0;

        // Loop until the computer guesses correctly
        while (!feedback.equals("correct")) {
            int guess = generateGuess(lowerBound, upperBound);
            guessCount++;

            // Print the guess and get feedback
            System.out.println("My guess is: " + guess);
            feedback = getFeedback();

            // Update the bounds based on feedback
            if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            }
        }

        System.out.println("Hooray! I guessed your number in " + guessCount + " attempts.");
    }

    public static void main(String[] args) {
        playGame();
    }
}
