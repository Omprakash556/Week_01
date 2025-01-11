import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking Celsius temperature as input
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Formula to convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Printing the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        // Close the scanner
        input.close();
    }
}
