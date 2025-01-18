import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacci(int terms){
        long a = 0, b = 1;
        System.out.println("Fibonacci sequence of given  "+terms+" terms.");
        for (int i=0; i<terms; i++){
            System.out.print(a+" ");
            long nextTerm = a+b;
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms for finding Fibonacci: ");

        int terms = input.nextInt();

        if(terms<0) System.out.println("Please enter the positive number ");
        else printFibonacci(terms);
    }
}
