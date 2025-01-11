import java.util.Scanner;

public class LargestAndSecondLargest2D {
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");
		
		// Declare a Variable
        long number = input.nextLong();

        int maxIndex = 10;

        int index = 0;

		// Store number in array
        int[] digits = new int[maxIndex];
		
		// Check number is greater than Zero or not
        while(number>0){
            int lastDigit = (int)(number%(long)10);
            number/=(long)10;

            if(index<maxIndex){
                digits[index] = lastDigit;
                index++;
            }
            else{
                maxIndex*=2;
                int[] temp = new int[maxIndex];
                for(int i=0;i<maxIndex/2;i++){
                    temp[i] = digits[i];
                }
                digits = temp;
                digits[index] = lastDigit;
                index++;
            }
        }

        int largest = -1;
        int secondLargest = -1;
        for(int i=0;i<maxIndex;i++){
            if(digits[i]>secondLargest){
                if(digits[i]>largest){
                    secondLargest = largest;
                    largest = digits[i];
                }
                else secondLargest = digits[i];
            }
        }

		// Display results 
        System.out.println("Largest digit is "+largest);
        System.out.println("Second largest digit is "+secondLargest);
		
		// close the Scanner
		input.close();
    }
}