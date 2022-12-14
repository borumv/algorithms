package Leetcode.DynamicProg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    void shouldReturnFefteen(){
        MinCostClimbingStairs climbingStairs = new MinCostClimbingStairs();
        int[] testingData = new int[]{10,15,20};
        assertEquals(15, climbingStairs.minCostClimbingStairs(testingData));
    }

    @Test
    void shouldReturnSix(){
        MinCostClimbingStairs climbingStairs = new MinCostClimbingStairs();
        int[] testingData = new int[]{1,100,1,1,1,100,1,1,100,1};
        assertEquals(6, climbingStairs.minCostClimbingStairs(testingData));
    }

}