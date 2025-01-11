import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the number from user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum of divisors
        int sum = 0;

        // Loop to find divisors of the number
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                sum += i;  // Add divisor to sum
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
