import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to calculat natural number
    public static int recursiveSum(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Method to calculate the sum of first n natural
    public static int formulaSum(int n) {
        // Formula: n * (n + 1) / 2
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }

        int recursiveResult = recursiveSum(n);
        
        int formulaResult = formulaSum(n);

        // Display the results
        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using the formula: " + formulaResult);

        // Compare both results
        if (recursiveResult == formulaResult) {
            System.out.println("Both methods give the same result, and the computation is correct.");
        } else {
            System.out.println("There is a discrepancy in the results.");
        }

        // Close the scanner
        input.close();
    }
}
