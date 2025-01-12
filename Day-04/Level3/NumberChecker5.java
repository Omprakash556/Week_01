import java.util.Scanner;

public class NumberChecker5 {

    public static int[] findFactors(int number) {
        int[] tempFactors = new int[number]; 
        int count = 0;
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                tempFactors[count] = i;
                count++;
            }
        }
        
        int[] factors = new int[count];
        System.arraycopy(tempFactors, 0, factors, 0, count);
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }
        return greatest;
    }
	
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }


    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }


    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1.0;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }


    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum > number;
    }


    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum < number;
    }
	
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum += factorial(digit);
            tempNumber /= 10;
        }

        return sum == number;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int greatest = greatestFactor(factors);
        System.out.println("Greatest Factor: " + greatest);

        int sumFactors = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumFactors);

        int productFactors = productOfFactors(factors);
        System.out.println("Product of Factors: " + productFactors);

        double productOfCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }


        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }


        if (isDeficientNumber(number)) {
            System.out.println(number + " is a Deficient Number.");
        } else {
            System.out.println(number + " is not a Deficient Number.");
        }
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }

        // Close scanner
        scanner.close();
    }
}
