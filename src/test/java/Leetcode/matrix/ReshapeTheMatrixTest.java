package Leetcode.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeTheMatrixTest {

    ReshapeTheMatrix reshapeTheMatrix;

    @BeforeEach
    void setUp() {
        reshapeTheMatrix = new ReshapeTheMatrix();
    }

    @Test
    void shouldReturnOneTwoThreeFour() {
        int[][] mat = {{1,2}, {3,4}};
        int r = 1;
        int c = 4;
        int [][] expected = {{1,2,3,4}};
        int [][] actual = reshapeTheMatrix.matrixReshape(mat, r, c);
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldReturnOneTwoThreeFourInDifferentMassives() {
        int[][] mat = {{1,2}, {3,4}};
        int r = 2;
        int c = 4;
        int [][] expected = {{1,2},{3,4}};
        int [][] actual = reshapeTheMatrix.matrixReshape(mat, r, c);
        assertArrayEquals(expected,actual);
    }
}