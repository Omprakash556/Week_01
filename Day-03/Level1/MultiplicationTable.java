import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
	// Create a Scanner object
Scanner input = new Scanner(System.in);

// Assign a variable  
int number;

System.out.println("Enter a Number: ");
number = input.nextInt();

// Create an Array of integerArray for storing number
int[] integerArray = new int[10];

//  Loop through 1 to 10 and store the results in the multiplicationTable array
 for (int i = 0; i < 10; i++) {
            integerArray[i] = number * (i + 1);
        }
 // Print the multiplication table in the specified format
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + integerArray[i]);
        }
		
		// Close Scanner
		input.close();
}
}
