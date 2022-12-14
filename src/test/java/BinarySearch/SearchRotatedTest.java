package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRotatedTest {

    @Test
    void shouldReturn0(){
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        int output = 0;
        SearchRotated searchRotated = new SearchRotated();
        assertEquals(output, searchRotated.search(nums, target));
    }

}