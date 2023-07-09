package BinarySearch;

import org.junit.jupiter.api.Test;
import udemy.BinarySearch.FindMinimumInRotatedSortedArray;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

    //Explanation: The original array was [1,2,3,4,5] rotated 3 times.
    @Test
    void shouldReturnOne(){
        int[] input = new int[]{3,4,5,1,2};
        int output = 1;
        FindMinimumInRotatedSortedArray f = new FindMinimumInRotatedSortedArray();
        assertEquals(output, f.findMin(input));
    }

    //The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
    @Test
    void shouldReturnZero(){
        int[] input = new int[]{4,5,6,7,0,1,2};
        int output = 0;
        FindMinimumInRotatedSortedArray f = new FindMinimumInRotatedSortedArray();
        assertEquals(output, f.findMin(input));
    }

    //The original array was [11,13,15,17] and it was rotated 4 times.
    @Test
    void shouldReturnEleven(){
        int[] input = new int[]{11,13,15,17};
        int output = 11;
        FindMinimumInRotatedSortedArray f = new FindMinimumInRotatedSortedArray();
        assertEquals(output, f.findMin(input));
    }
}