import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Get the number input from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if the input number is a positive or not
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return; // Exit the program
        }
        
        // Create an array to store the results
        String[] fizzBuzzArray = new String[number];
        
        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[i - 1] = "Buzz";
            } else {
                fizzBuzzArray[i - 1] = String.valueOf(i); 
            }
        }
        
        // Loop through the array and print the results in the required format
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzzArray[i]);
        }
        
        // Close the scanner
        input.close();
    }
}
