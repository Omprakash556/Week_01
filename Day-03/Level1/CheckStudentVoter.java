import java.util.Scanner;

public class CheckStudentVoter{
	public static void main(String[] args){
	// Create a Scanner object for taking user input
	Scanner input = new Scanner(System.in);
	
	
	// Create a array of students for holding there age
	int[] studentsAge = new int[10];
		
	System.out.println("Enter 10 students age :");
	// Take age of 10 Students using for loop 
    for(int i=0; i<10; i++){
	 studentsAge[i] = input.nextInt();
	}
	
	// Iterate on a loop for checking students can vote or not
	for(int i=0; i<10; i++){
		if(studentsAge[i]>=18){
		System.out.println("This students with the age of "+studentsAge[i]+" can vote.");
		}else{
		System.out.println("This students with age of "+studentsAge[i]+" can not vote.");
		}
	}
	
	input.close();
    }
}