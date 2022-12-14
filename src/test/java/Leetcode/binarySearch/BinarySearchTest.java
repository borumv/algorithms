package Leetcode.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        BinarySearch binarySearch = new BinarySearch();
        int[] values = new int[]{5};
        assertEquals(0, binarySearch.search(values, 5));
    }
}