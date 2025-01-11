import java.util.Scanner;

public class CheckNaturalSum {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Declare a variable
        int number;

        // Take input from user
        System.out.println("Enter a number: ");
        number = input.nextInt();

        // Check the number is Natural or not
        if(number > 0){

            // Calculate sum of given natural number
            int sumOfNaturalNumber = (number*(number+1)/2);
            System.out.println("The sum of "+number+" natural numbers is "+sumOfNaturalNumber+".");
        }else {
            System.out.println("The number "+number+" is not a Natural number.");
        }

        // Close the scanner
        input.close();
    }
}
