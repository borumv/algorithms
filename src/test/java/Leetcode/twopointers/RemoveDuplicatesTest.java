package Leetcode.twopointers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    RemoveDuplicates removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    void  shouldReturnFive(){
        int[] nums = new int[] {1,1,1,2,2,3}; // Input array
        int[] expectedNums = new int[]{1,1,2,2,3}; // The expected answer with correct length

        int k = removeDuplicates.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }


    @Test
    void  shouldReturnSeven(){
        int[] nums = new int[] {0,0,1,1,1,1,2,3,3}; // Input array
        int[] expectedNums = new int[]{0,0,1,1,2,3,3}; // The expected answer with correct length

        int k = removeDuplicates.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }


    @Test
    void  shouldReturnTwelve(){
        int[] nums = new int[] {0,0,1,1,1,1,2,3,3,5,7,7,7,9}; // Input array
        int[] expectedNums = new int[]{0,0,1,1,2,3,3,5,7,7,9}; // The expected answer with correct length

        int k = removeDuplicates.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }


}