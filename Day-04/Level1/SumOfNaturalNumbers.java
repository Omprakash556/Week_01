import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of first n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        // Loop from 1 to n and calculate the sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);

        // User to enter the value of n
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = sumOfNaturalNumbers(number);
            System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
        }

        // Close the scanner 
        input.close();
    }
}
