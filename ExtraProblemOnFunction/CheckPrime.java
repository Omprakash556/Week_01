import java.util.Scanner;
import java.util.logging.SocketHandler;

public class CheckPrime {

    public static void isPrime(int number1){
        boolean flag = true;
        if(number1 <= 1) {
            System.out.println("Please a number greater than 2");
        }
        for (int i=2; i<number1; i++){
            if(number1%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Given number is prime. ");
        }else {
            System.out.println("Given number is not prime. ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number1 = input.nextInt();

        isPrime(number1);
    }
}
