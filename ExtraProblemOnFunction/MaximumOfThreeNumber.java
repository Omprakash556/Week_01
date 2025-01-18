import java.util.Scanner;

public class MaximumOfThreeNumber {
    public static int[] take3Number(){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];
        System.out.println("Enter first number: ");
         numbers[0] = input.nextInt();

        System.out.println("Enter second number: ");
         numbers[1] = input.nextInt();

        System.out.println("Enter third number: ");
         numbers[2] = input.nextInt();

         return numbers;
    }

    public static int maximumOf3Number(int number1, int number2, int number3){
        if(number1 > number2 && number1 > number2) return number1;
        else if(number2 > number1 && number2 > number3) return number2;
        else return number3;
    }
    public static void main(String[] args) {
        int[] numbers = take3Number();

        int maxNumber = maximumOf3Number(numbers[0], numbers[1], numbers[2]);
        System.out.println("Maximum of three number is "+maxNumber);
    }
}
