package Leetcode.hashmap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    MajorityElement majorityElement;

    @BeforeEach
    void init(){
        majorityElement = new MajorityElement();
    }

    @Test
    void shouldReturnThree(){
        int[]nums = new int[]{3,2,3};
        int output = 3;
        assertEquals(output, majorityElement.majorityElement(nums));
    }

    @Test
    void shouldReturnTwo(){
        int[]nums = new int[]{2,2,1,1,1,2,2};
        int output = 2;
        assertEquals(output, majorityElement.majorityElement(nums));
    }

    @Test
    void shouldReturnSix(){
        int[]nums = new int[]{6,5,5};
        int output = 5;
        assertEquals(output, majorityElement.majorityElement(nums));
    }
}