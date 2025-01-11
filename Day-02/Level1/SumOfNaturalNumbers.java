import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number n
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        // Check if the entered number is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute the sum using the formula: n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using the while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;  // Add i to loopSum
                i++;           // Increment i
            }

            // Compare the results
            System.out.println("Sum using formula (n * (n + 1) / 2): " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Check if both results are the same
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There seems to be an error in the computations.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

