import java.util.Scanner;

public class CheckVoter {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Declare a variable
        int age;

        // Take input from user
        System.out.println("Enter age for check person can vote or not: ");
        age = input.nextInt();

        // Check person can vote or not
        if(age > 18){
            System.out.println("The person's age is "+age+" and can vote.");
        }else {
            System.out.println("The person's age is " + age+" and can not vote.");
        }

        // Close the scanner
        input.close();
    }
}
