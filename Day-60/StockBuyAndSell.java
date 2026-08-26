public class StockBuyAndSell {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate today's profit
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}