import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking weight in pounds as input
        System.out.print("Enter the weight in pounds: ");
        double pounds = input.nextDouble();

        // Conversion formula: 1 pound = 2.2 kg
        double kilograms = pounds * 2.2;

        // Printing the result
        System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kilograms);

        // Close the scanner
        input.close();
    }
}
