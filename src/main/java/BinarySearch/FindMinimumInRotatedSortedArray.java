package BinarySearch;

import java.util.Arrays;

/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

    [4,5,6,7,0,1,2] if it was rotated 4 times.
    [0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/?envType=study-plan&id=algorithm-ii
*/
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] massive) {

        if (massive.length == 1){
            return massive[0];
        }
        int right = massive.length;
        int mediana = right / 2;
        int[] leftArray = Arrays.copyOfRange(massive, 0, mediana);
        int[] rightArray = Arrays.copyOfRange(massive, mediana, right);
        int comparingLeft = findMin(leftArray);
        int comparingRight = findMin(rightArray);

        return Math.min(comparingLeft, comparingRight);
    }

//    private int comparing(int[]massive){
//        if (massive.length == 1){
//            return massive[0];
//        }
//        int left =0;
//        int right = massive.length - 1;
//        int mediana = (left + right)/2;
//        int[] leftArray = Arrays.copyOfRange(massive, left, mediana - 1);
//        int[] rightArray = Arrays.copyOfRange(massive, mediana, right - 1);
//        int comparingLeft = comparing(leftArray);
//        int comparingRight = comparing(rightArray);
//
//        return Math.min(comparingLeft, comparingRight);
//
//
//    }


}
