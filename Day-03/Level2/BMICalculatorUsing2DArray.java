import java.util.Scanner;

public class BMICalculatorUsing2DArray {
    public static void main(String[] args) {
	// Create a Scanner Object
        Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number of person: ");
        int person = input.nextInt();

	// Take array fir personData
        double[][] personData = new double[person][3];

	// Take input from user of Weight of person and Height of person 
        for(int i=0;i<person;i++){
            System.out.println("Enter Weight of person "+(i+1));
            personData[i][0] = input.nextInt();
            System.out.println("Enter height of person "+(i+1));
            personData[i][1] = input.nextInt();
        }

	// Calculate BMI of using given formula
        for(int i=0;i<person;i++){
            personData[i][2] = (double)personData[i][0]/((double)personData[i][1]*(double)personData[i][1])*(double)10000;
        }
  
  String[] status = new String[person];
  
	// Display the output
  for(int i=0;i<person;i++){
   if(personData[i][2]<=18.4)status[i] = "UnderWeight";
   else if(personData[i][2]<25)status[i] = "Normal";
   else if(personData[i][2]<40)status[i] = "OverWeight";
   else status[i] = "Obese";
  }
  
  for(int i=0;i<person;i++){
   System.out.println(personData[i][2]);
   System.out.println(status[i]);
  }
	// close Scanner object
	input.close();

    }
}