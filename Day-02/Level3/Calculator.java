import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for first number, second number, and operator
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String op = scanner.next();

        // Variable to store the result
        double result;

        // Switch case to handle the operation based on operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator. Please use one of the following: +, -, *, /.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
