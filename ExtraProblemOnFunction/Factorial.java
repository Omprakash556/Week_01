import java.util.Scanner;

public class Factorial {
    public static int inputInt(){
        System.out.println("Enter a number for calculating factorial: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static long calculateFactorial(long number){
        if(number == 0 || number == 1)return 1;
        else return number * calculateFactorial(number-1);
    }

    public static void displayResults(int number, long factorial){

        System.out.println("Factorial of given number "+number+" is "+factorial);
    }
    public static void main(String[] args) {
        int number = inputInt();

        long results = calculateFactorial(number);

        displayResults(number, results);




    }
}
