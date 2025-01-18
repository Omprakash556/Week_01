import java.util.Scanner;

public class TemperatureConversion {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void printResults(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice ");
        System.out.println("1. fahrenheit To Celsius ");
        System.out.println("2. celsius To Fahrenheit ");

        System.out.println("Enter choice 1 or 2: ");
        int choice = input.nextInt();

        if(choice == 1 ){
            System.out.println("Enter fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double resultF = fahrenheitToCelsius(fahrenheit);
            System.out.println("After conversion fahrenheit To Celsius= "+resultF);
        } else if (choice == 2) {
            System.out.println("Enter celsius: ");
            double celsius = input.nextDouble();
            double resultsC = celsiusToFahrenheit(celsius);
            System.out.println("After conversion celsius To Fahrenheit= "+resultsC);
        }else {
            System.out.println("Please enter valid choice :");
        }

    }
    public static void main(String[] args) {
        printResults();
    }
}
