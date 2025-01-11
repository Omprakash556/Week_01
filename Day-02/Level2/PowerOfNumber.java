import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for number and power
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize result variable to 1
        int result = 1;

        // Run a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by number in each iteration
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
