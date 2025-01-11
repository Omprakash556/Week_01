import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Input the Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter the Time in years: ");
        double time = input.nextDouble();
        
        // Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " 
                            + principal + ", Rate of Interest " + rate + " and Time " + time);
        
        // Close the scanner
        input.close();
    }
}
