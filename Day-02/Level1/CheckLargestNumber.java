import java.util.Scanner;

public class CheckLargestNumber {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Declare the variable
        int number1, number2, number3;

        // Take input from user
        System.out.println("Enter number1: ");
        number1 = input.nextInt();

        System.out.println("Enter number2: ");
        number2 = input.nextInt();

        System.out.println("Enter number3: ");
        number3 = input.nextInt();

        // Display result
        if(number1 > number2 && number1 > number3){
            System.out.println("First number is largest in given three number.");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Second number is largest in given three number.");
        }else {
            System.out.println("Third number is largest in given three number.");
        }

        // Close Scanner
        input.close();
    }
}
