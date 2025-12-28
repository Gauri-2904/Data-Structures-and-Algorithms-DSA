/*
 * Problem: Best Time to Buy and Sell Stock
 * LeetCode: 121
 *
 * You are given an array prices where prices[i] is the price of a given
 * stock on the i-th day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 *
 * Example:
 * Input:  prices = [7,1,5,3,6,4]
 * Output: 5
 *
 * Approach:
 * - Track the minimum buying price so far.
 * - For each day, calculate the profit if sold on that day.
 * - Update the maximum profit accordingly.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxProfit(int[] prices) {

        // Minimum price to buy the stock
        int buyPrice = prices[0];

        // Maximum profit achievable
        int profit = 0;

        // Traverse prices starting from day 1
        for (int i = 1; i < prices.length; i++) {

            // Update buying price if a lower price is found
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                // Calculate profit if sold today
                int currentProfit = prices[i] - buyPrice;
                profit = Math.max(profit, currentProfit);
            }
        }

        return profit;
    }
}
