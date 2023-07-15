package Leetcode.DynamicProg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150
* ��� ��� ������������� ������ ���, ��� ����[i] � ���� ������ ����� �� i-� ����.
* ������ ���� �� ������ ������ ������ �/��� ������� �����.
* � ����� ������ ������� �� ������ ������� �� ����� ��� ����� ������.
* ������ �� ������ ������ ��� � ��� �� ������� � ��� �� ����.
* ������� � ������� ������������ �������, ������� �� ������ ��������.
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
