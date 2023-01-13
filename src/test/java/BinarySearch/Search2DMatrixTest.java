package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixTest {

    @Test
    void shouldReturnTrue(){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean result = true;
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        assertEquals(result, search2DMatrix.searchMatrix(matrix,target));
        }

    @Test
    void shouldReturnFalse(){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        boolean result = false;
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        assertEquals(result, search2DMatrix.searchMatrix(matrix,target));
    }
    @Test
    void shouldReturnTrue2(){
        int[][] matrix = {{1}};
        int target = 1;
        boolean result = true;
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        assertEquals(result, search2DMatrix.searchMatrix(matrix,target));
    }

}