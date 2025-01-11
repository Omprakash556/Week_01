import java.util.Scanner;

public class TemperatureConversion2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking Fahrenheit temperature as input
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Formula to convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Printing the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

        // Close the scanner
        input.close();
    }
}