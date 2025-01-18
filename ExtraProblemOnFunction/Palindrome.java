import java.util.Scanner;

public class Palindrome {
    public static String inputString(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String for checking palindrome: ");
        return input.nextLine();
    }
    public static boolean checkPalindrome(String text){
        String mainText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0, end = text.length()-1;
       while (start<end){
           if(mainText.charAt(start) != mainText.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return true;
    }

    public static void displayPalindrome(boolean checkPalindrome){
        if(checkPalindrome){
            System.out.println("This given String is Palindrome. ");
        }else System.out.println("This given String is not Palindrome. ");
    }
    public static void main(String[] args) {
       String text =  inputString();
       boolean results = checkPalindrome(text);
        displayPalindrome(results);
    }
}
