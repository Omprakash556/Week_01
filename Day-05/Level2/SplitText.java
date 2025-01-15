import java.util.Scanner;

public class SplitText{
	public static int lengthStringWithotBuilt(String text){
		int charCount = 0;
		try{
			while(true){
				text.charAt(charCount);
				charCount++;
			}
		}catch(IndexOutOfBoundsException e){
			return charCount;
		}
	}
	
	public static String[] splitWords(String text){
		int length = lengthStringWithotBuilt(text);
		int wordCount = 1;
		for(int i=0; i<length; i++){
			if(text.charAt(i)==' '){
				wordCount++;
			}
		}
		
		String[] words = new String[wordCount];
		int wordIndex = 0;
		int start = 0;
		
		for(int i=0; i<length; i++){
			if(text.charAt(i)==' ' || i == length-1){
				if(i == length-1 && text.charAt(i) != ' '){
					i++;
				}
					words[wordIndex] = text.substring(start, i).trim();
					wordIndex++;
					start=i+1;	
			}
		}
		return words;	
	}
	
	public static boolean isCompare(String[] array1, String[] array2){
		if(array1.length != array2.length)return false;
		
		for(int i=0; i<array1.length; i++){
			if(!array1[i].equals(array2[i])){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		String text = input.nextLine();
		
		String[] userModify = splitWords(text);
		
		String[] inBuilt = text.split(" ");
		
		boolean results = isCompare(userModify, inBuilt);
		
		System.out.println("Word is split using user modify : ");
		for(String word: userModify){
			System.out.println(word);
		}
		System.out.println("Word is split using inBuilt Method: ");
		for(String word : inBuilt){
			System.out.println(word);
		}
		
		System.out.println("After splitting results is equals "+results);
		
		input.close();
	}
}

