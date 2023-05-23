package TwoPointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray;
    @BeforeEach
    void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    void ShouldReturnArray() {
        int[]nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[]nums2 = {2,5,6};
        int n = 3;
        int[]expected = {1,2,2,3,5,6};
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void ShouldReturnSingleArray() {
        int[]nums1 = {1};
        int m = 1;
        int[]nums2 = {};
        int n = 0;
        int[]expected = {1};
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void ShouldReturnSingleArrayWithoutZero() {
        int[]nums1 = {0};
        int m = 0;
        int[]nums2 = {1};
        int n = 1;
        int[]expected = {1};
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void ShouldReturnArraySecond() {
        int[]nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[]nums2 = {1,2,3};
        int n = 3;
        int[]expected = {1,2,3,4,5,6};
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
}