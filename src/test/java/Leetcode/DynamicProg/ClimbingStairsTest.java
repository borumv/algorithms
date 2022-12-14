package Leetcode.DynamicProg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void returnTwoIfTwo(){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    void returnThreeIfThree(){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    void returnFiveIfFour(){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(5, climbingStairs.climbStairs(4));
    }

}