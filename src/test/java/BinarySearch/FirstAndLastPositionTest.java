package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastPositionTest {

    @Test
    void shouldReturnThreeAndFour() {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] input = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] result = new int[]{3,4};
        assertArrayEquals(result, firstAndLastPosition.searchRange(input, target));
    }
    @Test
    void shouldReturnMinusOne() {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] input = new int[]{5,7,7,8,8,10};
        int target = 46;
        int[] result = new int[]{-1, -1};
        assertArrayEquals(result, firstAndLastPosition.searchRange(input, target));
    }
    @Test
    void shouldReturnMinusOneSecond() {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] input = new int[]{};
        int target = 0;
        int[] result = new int[]{-1, -1};
        assertArrayEquals(result, firstAndLastPosition.searchRange(input, target));
    }

    @Test
    void shouldReturnZeroZero() {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] input = new int[]{1};
        int target = 1;
        int[] result = new int[]{0,0};
        assertArrayEquals(result, firstAndLastPosition.searchRange(input, target));
    }
    @Test
    void shouldReturnTwoTwo() {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] input = new int[]{2,2};
        int target = 2;
        int[] result = new int[]{0,1};
        assertArrayEquals(result, firstAndLastPosition.searchRange(input, target));
    }

    @Test
    void shouldReturnOneOne() {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] input = new int[]{1,4};
        int target = 4;
        int[] result = new int[]{1,1};
        assertArrayEquals(result, firstAndLastPosition.searchRange(input, target));
    }

    @Test
    void shouldReturnMinisMinus() {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] input = new int[]{5,7,7,8,8,10};
        int target = 6;
        int[] result = new int[]{-1, -1};
        assertArrayEquals(result, firstAndLastPosition.searchRange(input, target));
    }
}