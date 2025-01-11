import java.util.Scanner;

public class CalculatePercentageAndGrade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take user input.

  System.out.println("Enter total number of Students: ");
  
  int number = sc.nextInt();
  
  int[][] marks = new int[number][3];

        // Get marks for each subject from the user.
  for(int i=0;i<number;i++){
   System.out.println("Enter marks of Physics for Student "+(i+1));
   marks[i][0] = sc.nextInt();  // Input Physics marks.
   System.out.println("Enter marks of Chemistry for Student "+(i+1));
   marks[i][1] = sc.nextInt();  // Input Chemistry marks.
   System.out.println("Enter marks of Maths for Student "+(i+1));
   marks[i][0] = sc.nextInt();  // Input Maths marks.
   if(marks[i][0]<0 || marks[i][1]<0 || marks[i][2]<0){
    System.out.println("Enter marks correctly");
    i--;
   }
  }

        // Calculate the average of the three subjects.
        int[] average = new int[number];
  
  for(int i=0;i<number;i++){
   average[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3;
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