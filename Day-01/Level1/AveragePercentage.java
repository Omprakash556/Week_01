public class AveragePercentage{
	public static void main(String[] args) {
	
	// Marks in 
	int math = 94;
	int physics = 95;
	int chemistry = 96;
	
	int totalMarks = math+physics+chemistry;
	double averagePercentage = (totalMarks*100)/300;
	System.out.println("Sam’s average mark in PCM is "+averagePercentage +"%");
	}
}