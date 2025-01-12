import java.util.Scanner;

public class NumberChecker {

    // Method to check if the number is positive or negative
    public static boolean isPositive(int num) {
        return num > 0; // Returns true if number is positive, false otherwise
    }

    // Method to check if the number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0; // Returns true if number is even, false if odd
    }

    // Method to compare two numbers 
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1; // num1 is greater
        } else if (num1 < num2) {
            return -1; // num1 is smaller
        } else {
            return 0; // num1 and num2 are equal
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Loop through the array for check positive/negative, even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println("Number " + num + " is positive and even.");
                } else {
                    System.out.println("Number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is negative.");
            } else {
                System.out.println("Number " + num + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        // Close the scanner
        sc.close();
    }
}

