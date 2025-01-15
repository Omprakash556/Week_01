import java.util.Scanner;
public class StringLengthWithoutInBuiltMethod{

	public static String findLengthWithoutUsingInBuiltMethod(String text){
		int currLength = 0;
		try{
			while(true){
				text.charAt(currLength);
				currLength++;
			}
		}catch(IndexOutOfBoundsException  e){
				currLength++;
		}
	
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String text = input.next();
		
		int userFindLength = findLengthWithoutUsingInBuiltMethod(text);
		int results = text.length();
		
			System.out.println("String length with out using length function is "+userFindLength);
			System.out.println("String length using length function is "+results);
	}
}