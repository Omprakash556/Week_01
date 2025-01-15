import java.util.Scanner;

public class CheckStringOutOfBound{
	
	// Method for Generate String Out Of Bound  
	public static void generateStringOutOfBoundExcep(String text){
		System.out.println(text.charAt(text.length()));
	}
	
	// Method of handle String out of bound
	public static void handleStringOutOfBoundExcep(String text){
		try{
			System.out.println(text.charAt(text.length()));
		}catch(StringIndexOutOfBoundsException  e){
			System.out.println("catch String out of bound Exception. "+e);
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String string = input.next();
		
		// Display results of Calling method string out of bound
		System.out.println("Calling generate String Out Of Bound Exception....");
		generateStringOutOfBoundExcep(string);
		
		// Display results of handling the string out of bound 
		System.out.println("Calling the method of handle String Out Of Bound Exception.....");
		handleStringOutOfBoundExcep(string);
		
	}

}