import java.util.Scanner;

class printCharacterOfString {
	public static char[] printCharacter(String str1){
		char array[] = new char[str1.length()];
		for(int i=0; i<str1.length(); i++){
		array[i] = str1.charAt(i);
		}
		return array;
	}
	
	public static boolean compareTwoArray(char[] array1, char[] array2) {
	if(array1.length != array2.length) return false;
	for(int i=0; i<array1.length; i++){
		if(array1[i] != array2[i])return false;
	}
	return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String string = input.next();
		
		char[] fromUserMethod = printCharacter(string);
		char[] inbuiltMethod = string.toCharArray();
		
		boolean results = compareTwoArray(fromUserMethod, inbuiltMethod);
		
		System.out.println("Character array using user defined method: ");
		for(char c : fromUserMethod ){
		System.out.print(c+" " );
		}
		System.out.println();
		
		 System.out.println("Character array using toCharArray() method: ");
		 for(char c :inbuiltMethod){
		System.out.print(c+" " );
		}
		System.out.println();
		
		System.out.println("After performing all operation the results is "+results);
		
		input.close();
	}

}