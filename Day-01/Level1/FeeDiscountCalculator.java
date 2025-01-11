import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for fee and discount percentage
        double fee, discountPercent;
        
        // Take user input for fee and discount percentage
        System.out.print("Enter the student fee: ");
        fee = input.nextDouble();  // User enters the fee
        
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();  // User enters the discount percentage
        
        // Calculate the discount amount
        double discount = (discountPercent / 100) * fee;
        
        // Calculate the final fee after applying the discount
        double finalFee = fee - discount;
        
        // Display the results
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finalFee);
        // Close the scanner
        input.close();
		
    }
}
