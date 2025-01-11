import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop from 1 to the number (exclusive)
        System.out.println("Factors of " + number + " are:");

        for (int i = 1; i < number; i++) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                // Print the factor
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
