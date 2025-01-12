import java.util.Scanner;

public class ChocolateDistribution {

    // Method for find the number of chocolates
    public static void findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            // Handle the edge case
            System.out.println("Number of children cannot be zero.");
        } else {
            // Calculate chocolates per child and remaining chocolates
            int quotient = numberOfChocolates / numberOfChildren;  
            int remainder = numberOfChocolates % numberOfChildren; 

            // Display the results
            System.out.println("Each child will get: " + quotient + " chocolates.");
            System.out.println("Remaining chocolates: " + remainder);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);

        // User to enter the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Call the method
        findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Close the scanner object
        input.close();
    }
}
