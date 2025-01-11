public class CourseDiscount {
    public static void main(String[] args) {
        // Given values
        double fee = 125000; // Original fee
        double discountPercent = 10; // Discount percentage

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double finalFee = fee - discount;

        // Display the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
