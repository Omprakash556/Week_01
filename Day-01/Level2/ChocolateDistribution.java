import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input= new Scanner(System.in);

        // Input the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate chocolates each child gets and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild
                + " and the number of remaining chocolates are " + remainingChocolates);

        // Close the scanner
       input.close();
    }
}
