import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input for unit price and quantity
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity of the item to be bought: ");
        int quantity = input.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice + ".");

        // Close the scanner
        input.close();
    }
}
