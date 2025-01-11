import java.util.Scanner;

public class FizzBuzz2 {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return; // Exit the program 
        }

        // Initialize the counter variable for the while loop
        int i = 1;

        // Loop from 1 to the entered number using while loop
        while (i <= number) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            // Otherwise, print the number itself
            else {
                System.out.println(i);
            }

            // Increment the counter variable
            i++;
        }

        // Close the scanner
        scanner.close();
    }
}
