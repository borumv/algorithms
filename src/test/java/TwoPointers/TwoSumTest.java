package TwoPointers;

import AlgoCourse2022.TwoPointers.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldReturnOneAndTwo(){
        int[] input = new int[]{2,7,11,15};
        int target = 9;
        int[]output = new int[]{1,2};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(output, twoSum.twoSum(input, target));
    }

    @Test
    void shouldReturnOneAndThree(){
        int[] input = new int[]{2,3,4};
        int target = 6;
        int[]output = new int[]{1,3};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(output, twoSum.twoSum(input, target));
    }

    @Test
    void shouldReturnMinusOneAndZero(){
        int[] input = new int[]{-1,0};
        int target = -1;
        int[]output = new int[]{1,2};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(output, twoSum.twoSum(input, target));
    }

}