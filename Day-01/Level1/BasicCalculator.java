import java.util.*;

public class BasicCalculator{
	public static void main(String[] args){
	// Create scanner object for input
	Scanner input = new Scanner(System.in);
	
	// declare variable for addition, subtraction, multiplication and division
	double number1, number2;
	System.out.println("Enter number1: ");  // user enter number1
	number1 = input.nextDouble();
	
	System.out.println("Enter number2: ");   //user enter number2 
	number2 = input.nextDouble();
	
	// Addition performing
	double addition = number1+number2;
	
	// subtraction performing
	double subtraction = number1-number2;
	
	// multiplication performing
	double multiplication = number1*number2;
	
	// division performing
	double division = number1/number2;
	
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 +"is "+addition+", "+subtraction+", "+multiplication+"and "+division);
	
	// close the scanner for prevent
	input.close();
	}
}