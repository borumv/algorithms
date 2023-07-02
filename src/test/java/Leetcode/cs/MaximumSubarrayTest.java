package Leetcode.cs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;
    @BeforeEach
    void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    void shouldReturnSix() {
        int[]massive = {-2,1,-3,4,-1,2,1,-5,4}; //-2, -1, -4, 0, -1, 1, 2, -4, 0
        int actual = maximumSubarray.maxSubArray(massive);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOne() {
        int[]massive = {1};
        int actual = maximumSubarray.maxSubArray(massive);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTwentyThree() {
        int[]massive = {5,4,-1,7,8}; //5, 9, 8, 15, 23
        int actual = maximumSubarray.maxSubArray(massive);
        int expected = 23;
        assertEquals(expected, actual);
    }
}