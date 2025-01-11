import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop from 100 down to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the input number
            if (i % number == 0) {
                // Print the multiple
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
