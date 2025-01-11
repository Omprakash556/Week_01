import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the number from user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum of digits
        int sum = 0;
        int tempNumber = number;  // Store original number for checking divisibility

        // Loop to calculate sum of digits
        while (tempNumber > 0) {
            sum += tempNumber % 10;  // Add the last digit to sum
            tempNumber /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
