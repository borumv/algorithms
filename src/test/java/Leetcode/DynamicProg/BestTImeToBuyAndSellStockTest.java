package Leetcode.DynamicProg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150
* ¬ам дан целочисленный массив цен, где цены[i] Ч цена данной акции на i-й день.
*  аждый день вы можете решить купить и/или продать акции.
* ¬ любой момент времени вы можете владеть не более чем одной акцией.
* ќднако вы можете купить его и тут же продать в тот же день.
* Ќайдите и верните максимальную прибыль, которую вы можете получить.
* */
public class BestTImeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock bestTimeClass;

    @BeforeEach
    void setUp() {
        bestTimeClass = new BestTimeToBuyAndSellStock();

    }


    @Test
    void shouldReturnSeven(){
       int[] prices = {7,1,5,3,6,4};
       int expected = 7;
       assertEquals(expected, bestTimeClass.maxProfit(prices));
    }

    @Test
    void shouldReturnFour(){
        int[] prices = {1,2,3,4,5};
        int expected = 4;
        assertEquals(expected, bestTimeClass.maxProfit(prices));
    }

    @Test
    void shouldReturnZero(){
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        assertEquals(expected, bestTimeClass.maxProfit(prices));
    }
}
