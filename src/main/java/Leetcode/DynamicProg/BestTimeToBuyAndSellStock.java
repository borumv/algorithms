package Leetcode.DynamicProg;
public class BestTimeToBuyAndSellStock {

//    int[] prices = {7,1,5,3,6,4};
//    int expected = 7;
//    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//    Total profit is 4 + 3 = 7.
    // {7, 8, 13, 16, 24, 28}
    // {7, 6, 10, 8, 11, 9}
    // {




    public int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i + 1]){
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }

}
