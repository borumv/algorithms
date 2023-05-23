package TwoPointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterSectionOfTwoArraysTest {

    InterSectionOfTwoArrays interSectionOfTwoArrays;
    @BeforeEach
    void setUp() {
        interSectionOfTwoArrays = new InterSectionOfTwoArrays();
    }

    @Test
    void ShouldReturnDoubleTwo() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] expected = {2,2};
        int[] actual = interSectionOfTwoArrays.intersect(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldReturnFourAndNine() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[][] expected = {{9,4},{4,9}};
        int[] actual = interSectionOfTwoArrays.intersect(nums1, nums2);

    }
}