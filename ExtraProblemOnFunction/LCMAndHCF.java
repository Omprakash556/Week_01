import java.util.Scanner;

public class LCMAndHCF {
    public static int[] inputNumber(){
        Scanner input = new Scanner(System.in);

        int[] number = new int[2];

        System.out.println("Enter first number: ");
        number[0] = input.nextInt();

        System.out.println("Enter second number: ");
        number[1] = input.nextInt();

        return number;
    }

    public static int findHCF(int number1, int number2){
        while (number2 != 0){
            int temp = number2;
            number2 = number1%number2;
            number1 = temp;
        }
        return number1;
    }

    public static int findLCM(int number1, int number2){
        return number1*number2/ findHCF(number1, number2);
    }

    public static void displayResults(int number1, int number2, int lcm, int hcf){
        System.out.println("For the number "+ number1+" and "+number2+" :");
        System.out.println("HCF of these two number is "+hcf);
        System.out.println("LCM of these two number is "+lcm);
    }
    public static void main(String[] args) {
        int[] number = inputNumber();

        int hcf = findHCF(number[0], number[1]);
        int lcm = findLCM(number[0], number[1]);

        displayResults(number[0], number[1], lcm, hcf);
    }
}
