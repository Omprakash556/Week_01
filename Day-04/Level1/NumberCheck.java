import java.util.Scanner;

public class NumberCheck {

    // Method to check if the number is negative, positive, or zero
    public static int checkNumber(int num) {
        if (num < 0) {
            return -1; 
        } else if (num > 0) {
            return 1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call the method to check the number and get the result
        int result = checkNumber(number);

        // Output the result based on the method's return value
        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        input.close();
    }
}
