import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for weight and height
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        // Converting height from cm to meters
        double heightInMeters = heightInCm / 100;

        // Calculating BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determining weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Displaying the result: BMI and weight status using println
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Your weight status is: " + status);

        scanner.close(); // Closing the scanner
    }
}
