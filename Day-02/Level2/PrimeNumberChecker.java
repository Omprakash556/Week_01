import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Prime number check Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return; // Exit the program
        }

        // Initialize a boolean variable to check if the number is prime
        boolean isPrime = true;

        // Loop from 2 to number-1 
        for (int i = 2; i < number; i++) {
            // Check if the number is divisible by i (any number other than 1 and itself)
            if (number % i == 0) {
                isPrime = false; // Number is not prime
                break; // Exit the loop
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
