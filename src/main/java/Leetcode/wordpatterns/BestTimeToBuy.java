package Leetcode.wordpatterns;

import java.util.Date;
import java.util.HashMap;

public class BestTimeToBuy {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("max profit - " + maxProfit(new int[]{7,1,5,3,6,4}));

        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд");
    }
    public static int maxProfit(int[] prices) {

//        int bestTime = 0;
//        int[][] resultProfits = new int[prices.length][1];
        int bestTimetime = 0;
        for (int i = 0; i < prices.length; i++) {

            for (int j = prices.length - 1; j > i ; j--) {
                if(prices[j] - prices[i] > bestTimetime){
                    bestTimetime = prices[j] - prices[i];
                }

            }
        }

//        for (int i = 0; i < resultProfits.length - 1; i++) {
//                if (resultProfits[i][0] > bestTime)
//                    bestTime = resultProfits[i][0];
//        }

        return bestTimetime;
    }
}
