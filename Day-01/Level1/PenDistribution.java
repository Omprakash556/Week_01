public class PenDistribution {
    public static void main(String[] args) {
        // Given values
        int totalPens = 14;
        int totalStudents = 3;

        // Calculating the number of pens each student gets
        int pensPerStudent = totalPens / totalStudents;

        // Calculating the remaining pens
        int remainingPens = totalPens % totalStudents;

        // Display the results
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
