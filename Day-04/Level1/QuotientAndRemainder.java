import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find and print the quotient and remainder
    public static void findRemainderAndQuotient(int number, int divisor) {
        // Calculate quotient and remainder
        int quotient = number / divisor;
        int remainder = number % divisor;

        // Print the results
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Call the method 
        findRemainderAndQuotient(number, divisor);

        // Close the scanner object
        input.close();
    }
}
