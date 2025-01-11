public class ProfitLossCalculator {
    public static void main(String[] args) {
        // Given values
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculating Profit and Profit Percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Display the results
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + " %");
    }
}
