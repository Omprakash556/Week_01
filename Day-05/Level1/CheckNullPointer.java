public class CheckNullPointer {

    // Method to generate NullPointerException
	public static void generateNullPointerException(){
		String str = null;
		
		System.out.println(str.length());
	}
	
	// Method to handle the null pointer using try catch block
	public static void handleNullPointer(){
		String str = null;
		
		try{
		System.out.println(str.length());
		}catch(NullPointerException e){
		System.out.println("Catch null pointer exception. "+e);
		}
	}
	public static void main(String[] args){
		
		// Display results
		System.out.println("Calling of generateNullPointerException. ");
		generateNullPointerException();
		
		System.out.println("handle the null pointer exception. ");
		handleNullPointer();
		
	}
  }
