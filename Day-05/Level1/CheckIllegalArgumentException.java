import java.util.Scanner;

public class CheckIllegalArgumentException {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text){
		System.out.println(text.substring(2,9));
	}
	
	public static void handleIllegalArgumentException(String text){
	
		try{
				System.out.println(text.substring(3,5));
		}catch(IllegalArgumentException e){
			System.out.println("After catching IllegalArgumentException. "+e);
		}
	}
	

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Calling the method of generate the exception
        System.out.println("Calling method to generate IllegalArgumentException...");
        generateIllegalArgumentException(text);

        // Calling the method of handle the exception
        System.out.println("Calling method to handle IllegalArgumentException...");
        handleIllegalArgumentException(text);

        input.close();
    }
}
