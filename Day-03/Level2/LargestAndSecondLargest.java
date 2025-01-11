import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;


        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;  // Get the last digit of the number
            number = number / 10;         // Remove the last digit from the number
            index++;
        }

        // Variables to store the largest and second largest digit
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest before largest
                largest = digits[i];      // Update largest
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];  // Update second largest if it's smaller than the largest but larger than the second largest
            }
        }

        // Display the largest and second largest digits
        if (largest != -1 && secondLargest != -1) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Not enough distinct digits to find second largest.");
        }

        // Close the scanner
        input.close();
    }
}
