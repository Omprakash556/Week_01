import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();  // Store the user's input in variable n

        // Check if the number entered is negative
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize the factorial to 1 (as multiplying by 1 does not change the value)
            long factorial = 1;
            int i = 1;  // Start from 1 for multiplication

            // Use a while loop to calculate the factorial
            while (i <= n) {
                factorial *= i;  // Multiply current factorial by i
                i++;  // Increase i by 1 
            }

            // Display results
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}
