import java.util.Scanner;

public class BasicCalculator {
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double sub(double num1, double num2){
        return num1 - num2;
    }
    public static double mul(double num1, double num2){
        return num1 * num2;
    }
    public static double div(double num1, double num2){
        if(num2 < 0){
            System.out.println("Can not divisible by zero. ");
        }
        return num1 / num2;
    }

    public static void performOperation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an Operation: ");
        System.out.println("1. Perform addition: ");
        System.out.println("2. Perform Subtraction: ");
        System.out.println("3. Perform Multiplication: ");
        System.out.println("4. Perform Division: ");

        System.out.println("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double number2 = input.nextDouble();

        System.out.println("Enter choice: ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                double resultsAdd = add(number1, number2);
                System.out.println("After addition of this two number is "+resultsAdd);
                break;
            case 2:
                double resultsSub = sub(number1, number2);
                System.out.println("After subtraction of this two number is "+resultsSub);
                break;
            case 3:
                double resultsMul = mul(number1, number2);
                System.out.println("After multiplication of this two number is "+resultsMul);
                break;
            case 4:
                double resultsDiv = div(number1, number2);
                System.out.println("After division of this two number is "+resultsDiv);
                break;
            default:
                System.out.println("Please enter valid choice ");
        }
    }
    public static void main(String[] args) {
        performOperation();
    }
}
