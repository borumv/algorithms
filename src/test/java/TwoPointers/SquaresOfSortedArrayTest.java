package TwoPointers;

import AlgoCourse2022.TwoPointers.SquaresOfSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {

    @Test
    void shouldReturnZeroOne(){
        int[]input = new int[]{-4,-1,0,3,10};
        int[]output = new int[]{0,1,9,16,100};
        SquaresOfSortedArray squares = new SquaresOfSortedArray();
        assertArrayEquals(output,squares.sortedSquares(input));
    }

//    @Test
//    void shouldReturnZeroOne(){
//        int[]input = new int[]{-4,-1,0,3,10};
//        int[]output = new int[]{0,1,9,16,100};
//        SquaresOfSortedArray squares = new SquaresOfSortedArray();
//        assertEquals(output,squares.sortedSquares(input));
//    }


}