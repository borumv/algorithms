package Leetcode.twopointers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    RemoveElement removeElement;

    @BeforeEach
    void  init(){
        removeElement = new RemoveElement();
    }

    @Test
    void shouldReturnTwo(){
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int expected = 2;
        assertEquals(expected, removeElement.removeElement(nums, val));
    }

    @Test
    void shouldReturnFive(){
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int expected = 5;
        assertEquals(expected, removeElement.removeElement(nums, val));
    }
}