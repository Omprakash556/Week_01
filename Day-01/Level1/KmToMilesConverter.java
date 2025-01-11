import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to hold the input distance in kilometers
        double km;
        
        // Ask the user to enter the distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble(); // Use nextDouble() since the input is a decimal value
        
        // Convert kilometers to miles (1 mile = 1.6 kilometers)
        double miles = km / 1.6;
        
        // Display the result
		System.out.println("The total miles is "+ miles+" mile for the given "+km);
        
        // Close the scanner
        input.close();
    }
}

