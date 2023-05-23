package Leetcode.DynamicProg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    PascalTriangle pascalTriangle;

    @BeforeEach
    void setUp() {
        pascalTriangle = new PascalTriangle();
    }

    @Test
    void generate() {
        int input = 5;
        List<List<Integer>> result = new ArrayList<>();
        int[][] arr = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        for (int[] subArr : arr) {
            result.add(new ArrayList<>(Arrays.asList(Arrays.stream(subArr).boxed().toArray(Integer[]::new))));
        }

        assertArrayEquals(result.toArray(), pascalTriangle.generate(input).toArray());
    }
}