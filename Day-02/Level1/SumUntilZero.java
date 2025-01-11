
    import java.util.Scanner;

    public class SumUntilZero {

        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Initialize total to 0.0
            double total = 0.0;

            // Create a variable to store the user-entered number
            double userInput;

            // Use a while loop to continue asking for input until the user enters 0
            do {
                System.out.print("Enter a number (enter 0 to stop): ");
                userInput = scanner.nextDouble();

                // If the user enters a non-zero value, add it to total
                if (userInput != 0) {
                    total += userInput;
                }

            } while (userInput != 0); // Continue until the user enters 0

            // Print the total value after the loop ends
            System.out.println("The total sum is: " + total);

            // Close the scanner
            scanner.close();
        }
    }


