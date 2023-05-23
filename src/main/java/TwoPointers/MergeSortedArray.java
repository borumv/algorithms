package TwoPointers;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n./
https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan&id=data-structure-i
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first_pointer = 0;
        int second_pointer = 0;
        int j = 0;

        while (first_pointer < m && second_pointer < n) {
            if (nums1[first_pointer] > nums2[second_pointer]) {
                swap(nums1, nums2, first_pointer, second_pointer);
                first_pointer++;
                second_pointer++;
            } else {
                first_pointer++;
            }
        }
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
    }
    private void swap(int[] array, int[] secondArray, int indexLeft, int indexRight){
        int i = array[indexLeft];
        array[indexLeft] = secondArray[indexRight];
        secondArray[indexRight] = i;
    }
}
