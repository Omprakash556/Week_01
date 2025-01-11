import java.util.Scanner;

public class FactorialCalculatorUsingForLoop {

    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();  // Store the entered number in variable n

        // Check if the entered number is negative
        if (n < 0) {
            // Print a message if the number is negative
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize the factorial to 1
            long factorial = 1;

            // Use a for loop to calculate the factorial
            for (int i = 1; i <= n; i++) {
                factorial *= i;  // Multiply the current factorial by i
            }

            // Output the result 
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}
