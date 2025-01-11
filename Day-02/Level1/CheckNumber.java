import java.util.Scanner;

/*      Write a program to check if the first is the smallest of the 3 numbers.
        I/P => number1, number2, number3
        O/P => Is the first number the smallest? ____
        */
public class CheckNumber {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Declare the variable
        int number1, number2, number3;

        // Take three number from user
        System.out.println("Enter number1: ");
        number1 = input.nextInt();

        System.out.println("Enter number2: ");
        number2 = input.nextInt();

        System.out.println("Enter number3: ");
        number3 = input.nextInt();

        // Display results
        if(number1 < number2 && number1 < number3){
            System.out.println("First number is the smallest number in given three number. ");
        }else {
            System.out.println("First number is not the smallest number in given three number.");
        }

        // Close Scanner
        input.close();
    }
}
