import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //User to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Check if the entered number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Use a for loop to iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd 
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
