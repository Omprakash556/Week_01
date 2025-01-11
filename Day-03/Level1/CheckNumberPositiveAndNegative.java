import java.util.Scanner;

public class CheckNumberPositiveAndNegative{
	public static void main(String[] args){
	// Create a Scanner Object
	Scanner input = new Scanner(System.in);
	
	// Initialised an array of number for checking some operation 
	int[] numbersArr = new int[5];
	
	System.out.println("Enter 5 number: ");
	// Take 5 number from user and store an array
	for(int i=0; i<5; i++){
	numbersArr[i] = input.nextInt(); // take input from user
	}
	
	// Display Results
	for(int i=0; i<5; i++){
		if(numbersArr[i]>0){
		System.out.println("Number "+ numbersArr[i]+" is Positive.");
		
		if(numbersArr[i]%2==0){
			System.out.println("Number "+numbersArr[i]+"is Even.");
		}else{
			System.out.println("Number "+numbersArr[i]+" is Odd.");
		}
		}else if(numbersArr[i]==0) {
			System.out.println("Number "+numbersArr[i]+" is Zero.");
		}else{
			System.out.println("Number "+numbersArr[i]+" is Negative.");
		}
	}
	int firstNumber = numbersArr[0]; // Assign first element of an array store in firstNumber
	int lastNumber = numbersArr[4];  // Assign last element of an array store in lastNumber
	
	if(firstNumber > lastNumber){
			System.out.println(" First number is greater than the lastNumber.");
		}else if(firstNumber==lastNumber){
			System.out.println("firstNumber and lastNumber are equal.");
		}else{
			System.out.println("First Number is less than lastNumber.");
		}
	// Close Scanner
	input.close();
	}

}