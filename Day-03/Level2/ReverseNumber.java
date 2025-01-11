import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the number of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp = temp / 10;  // Remove the last digit
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        temp = number;

        // Extract digits and store them in the array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;  // Get the last digit
            temp = temp / 10;       // Remove the last digit
        }

        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        // Close the scanner
        input.close();
    }
}
