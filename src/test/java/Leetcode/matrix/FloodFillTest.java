package Leetcode.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    FloodFill floodFill;

    @BeforeEach
    void setUp() {
      floodFill = new FloodFill();
    }

    @Test
    void floodFillFirst() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] expected = {{2,2,2},{2,2,0},{2,0,1}};
        assertEquals(expected, floodFill.floodFill(image,sr,sc,color));
    }

    @Test
    void floodFillSecond() {
        int[][] image = {{0,0,0},{0,0,0}};
        int sr = 0;
        int sc = 0;
        int color = 0;
        int[][] expected = {{0,0,0},{0,0,0}};
        assertEquals(expected, floodFill.floodFill(image,sr,sc,color));
    }
}