import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Swapping the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Printing the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner
        input.close();
    }
}
