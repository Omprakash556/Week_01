import java.util.Scanner;

public class CalculatePercentageAndGrade{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	 System.out.println("Enter total number of Students: ");
  
  int number = input.nextInt();
  
  int[] physics = new int[number];
  int[] chemistry = new int[number];
  int[] maths = new int[number];

        // Get marks for each subject from the user.
  for(int i=0;i<number;i++){
   System.out.println("Enter marks of Physics for Student "+(i+1));
   physics[i] = input.nextInt();  // Input Physics marks.
   System.out.println("Enter marks of Chemistry for Student "+(i+1));
   chemistry[i] = input.nextInt();  // Input Chemistry marks.
   System.out.println("Enter marks of Maths for Student "+(i+1));
   maths[i] = input.nextInt();  // Input Maths marks.
   if(physics[i]<0 || chemistry[i]<0 || maths[i]<0){
    System.out.println("Enter marks correctly");
    i--;
   }
  }

        // Calculate the average of the three subjects.
        int[] average = new int[number];
  
  for(int i=0;i<number;i++){
   average[i] = (physics[i]+chemistry[i]+maths[i])/3;
  }

        // Check the average and assign grade and remarks based on the range.
        for(int i=0;i<number;i++){
   System.out.println("For Student "+(i+1));
   if (average[i] >= 80) {
            System.out.println("Grade A with remark " + "Level 4 above agency-normalized standards");
        } else if (average[i] >= 70) {
            System.out.println("Grade B with remark " + "Level 3 at agency-normalized standards");
        } else if (average[i] >= 60) {
            System.out.println("Grade C with remark " + "Level 2 below, but approaching agency-normalized standards");
        } else if (average[i] >= 50) {
            System.out.println("Grade D with remark " + "Level 1 well below agency-normalized standards");
        } else if (average[i] >= 40) {
            System.out.println("Grade E with remark " + "Level 1- too below agency-normalized standards");
        } else {
            System.out.println("Remedial Standards");  // If average is below 40.
        }
  }
    }
}