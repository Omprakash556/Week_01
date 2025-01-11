import java.util.Scanner;

public class SumUntilZeroOrNegative {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Use an infinite while loop to continuously take user input
        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double userInput = scanner.nextDouble();

            // Check if the user entered 0 or a negative number to break the loop
            if (userInput <= 0) {
                break; // Exit the loop if 0 or a negative number is entered
            }

            // Add the user input to the total if it's positive
            total += userInput;
        }

        // Print the total value after the loop ends
        System.out.println("The total sum is: " + total);

        // Close the scanner
        scanner.close();
    }
}

