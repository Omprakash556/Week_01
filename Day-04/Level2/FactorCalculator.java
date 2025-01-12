import java.util.Scanner;

public class FactorCalculator {

    // Method to find the factors of the number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Store the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to calculate the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of the squares of the factors
    public static double sumOfSquareOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); // Squaring each factor
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find and store the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display the results
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquareOfFactors(factors));

        // Close the scanner
        input.close();
    }
}

