import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Printing the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);

        // Close the scanner
        input.close();
    }
}
