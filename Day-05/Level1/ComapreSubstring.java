import java.util.Scanner;

public class ComapreSubstring{
	public static String findSubstring(String str1, int startIndex, int endIndex){
		StringBuilder sb = new StringBuilder();
		for(int i=startIndex; i<endIndex; i++){
		sb.append(str1.charAt(i));
		}
		return sb.toString();
	}
	public static boolean comapreString(String str1, String str2){
	return str1.equals(str2);
	}
	
	public static void main(String[] args){
	// Take input from user 
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the String: ");
	String string = input.next();
	
	System.out.println("Enter stating index for substring: ");
	int startingIndex = input.nextInt();
	
	System.out.println("Enter ending index of String: ");
	int endingIndex = input.nextInt();
	
	// comapreString
	String substringUsingchatAt = findSubstring(string, startingIndex, endingIndex);
	String substringUsingMethod = string.substring(startingIndex, endingIndex);
	
	boolean results = comapreString(substringUsingchatAt, substringUsingMethod);
	
	// Display results
	System.out.println("Substring using charAt: "+substringUsingchatAt);
	System.out.println("Substring using inbuilt method: "+substringUsingMethod);
	System.out.println("Are substring equals: "+results);
	
	// close the scanner class 
	input.close();
	
	
	
	}
}