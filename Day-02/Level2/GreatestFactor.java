import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Read the number entered by the user

        // Define a variable greatestFactor and assign it an initial value of 1
        int greatestFactor = 1;

        // Create a loop to find the greatest factor starting from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i (i.e., number % i == 0)
            if (number % i == 0) {
                greatestFactor = i;  // Assign i to greatestFactor if it's a factor of number
                break;  // Exit the loop after finding the greatest factor
            }
        }

        // Display the greatest factor found (besides the number itself)
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);

        // Close the scanner 
        scanner.close();
    }
}
