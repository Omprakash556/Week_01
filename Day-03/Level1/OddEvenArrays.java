import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the entered number is a valid or not
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;  // Exit the program
        }
        
        // Calculate the size of the arrays for odd and even numbers
        int size = number / 2 + 1;
        
        // Create arrays for storing odd and even numbers
        int[] evenNumbers = new int[size];
        int[] oddNumbers = new int[size];
        
        // Initialize index variables for odd and even arrays
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        
        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();  // Print a new line
        
        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();  // Print a new line
        
        // Close the scanner
        input.close();
    }
}
