import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize the count variable to 0
        int count = 0;

        // Check if the number is 0, as it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop to count the digits by dividing the number by 10 each time
            while (number != 0) {
                number /= 10;  // Remove the last digit by dividing the number by 10
                count++;  // Increment count for each digit removed
            }
        }

        // Display the result
        System.out.println("The number of digits is: " + count);

        // Close the scanner
        scanner.close();
    }
}
