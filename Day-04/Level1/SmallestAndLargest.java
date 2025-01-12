import java.util.Scanner;

public class SmallestAndLargest {

    // Find the smallest and largest of three numbers using method
    public static void findSmallestAndLargest(int number1, int number2, int number3) {
        if(number1 > number2 && number1 > number3)System.out.println("Largest is "+number1);
        if(number2 > number1 && number2 > number3)System.out.println("Largest is "+number2);
        if(number3 > number1 && number3 > number2)System.out.println("Largest is "+number3);

        if(number1 < number2 && number1 < number3)System.out.println("smallest is "+number1);
        if(number2 < number3 && number2 < number1)System.out.println("smallest is "+number2);
        if(number3 < number1 && number3 < number2)System.out.println("smallest is "+number3);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number: ");
		
        System.out.println("Enter number1: ");
        int num1 = input.nextInt();
		
        System.out.println("Enter number2: ");
         int num2 = input.nextInt();
		
        System.out.println("Enter number3: ");
        int  num3 = input.nextInt();
		
        findSmallestAndLargest(num1,num2,num3);

        // Close the scanner object
        input.close();
    }
}
