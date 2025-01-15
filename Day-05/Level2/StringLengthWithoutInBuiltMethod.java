import java.util.Scanner;
public class StringLengthWithoutInBuiltMethod{

	// Method for find length without using in built
	public static int findLengthWithoutUsingInBuiltMethod(String text){
		int currLength = 0;
		try{
			while(true){
				text.charAt(currLength);
				currLength++;
			}
		}catch(IndexOutOfBoundsException  e){
					return currLength;
		}
	
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// taking input from user 
		System.out.println("Enter the String: ");
		String string = input.next();
		
		int userFindLength = findLengthWithoutUsingInBuiltMethod(string);
		int results = string.length();
		
		// Display results 
			System.out.println("String length with out using length function is "+userFindLength);
			System.out.println("String length using length function is "+results);
			
			// close scanner
		input.close();
	}
}