import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Create an array to store the frequency of digits (size 10 for digits 0-9)
        int[] frequency = new int[10];
        
        // Loop to extract digits and count their frequencies
        while (number != 0) {
            int digit = number % 10;  
            frequency[digit]++;      
            number = number / 10;     
        }

        // Display the frequency of each digit (0-9)
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }

        // Close the scanner
        input.close();
    }
}
