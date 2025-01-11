import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Store the original number 
        int originalNumber = number;

        // Initialize the sum variable to zero
        int sum = 0;

        // Use a while loop 
        while (number != 0) {
            // Find the last digit of the number
            int digit = number % 10;

            // Cube the digit and add it to the sum
            sum += digit * digit * digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
