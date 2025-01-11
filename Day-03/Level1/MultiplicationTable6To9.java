import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Define an array to store the multiplication results
        int[] multiplicationResult = new int[4]; // 4 elements for 6, 7, 8, and 9

        // Loop through 6 to 9 and store in the array
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;  // Store result in corresponding index
        }

        // Display the multiplication results
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;  // 6 to 9
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
        
        // Close the scanner
        input.close();
    }
}
