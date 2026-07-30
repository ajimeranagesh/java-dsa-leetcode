class Solution {

    public int maxProfit(int[] prices) {

        int currentProfit = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Daily price change
            int difference = prices[i] - prices[i - 1];

            // Kadane's Algorithm
            currentProfit = Math.max(0, currentProfit + difference);

            // Store the maximum profit
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }
}