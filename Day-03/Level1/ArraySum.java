import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Create an array to store up to 10 double values
        double[] numbers = new double[10];
        
        // Variable to store the total sum
        double total = 0.0;
        
        // Variable to track the index in the array
        int index = 0;
        
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Infinite loop to take input
        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            
            if (number <= 0) {
                break;
            }
            
            if (index < 10) {
                numbers[index] = number;
                index++;
            } else {
                System.out.println("Array is full, you can enter a maximum of 10 numbers.");
                break;
            }
        }
        
        // Calculate the total sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        
        // Display all the  numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        
        // Display total sum
        System.out.println("Total sum: " + total);
        
        // Close the scanner
        input.close();
    }
}
