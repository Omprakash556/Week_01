import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];  // Array to store the factors
        int index = 0; // for tracking
        
        // Loop to find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if i is a factor
                if (index == maxFactor) {
                    maxFactor *= 2;  // Double the size of the array
                    int[] temp = new int[maxFactor];  // Temporary array with the new size
                    
                    // Copy existing factors to the temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        
        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();  // Print a new line
        
        // Close the scanner
        input.close();
    }
}
