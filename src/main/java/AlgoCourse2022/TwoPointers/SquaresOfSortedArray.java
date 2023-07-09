package AlgoCourse2022.TwoPointers;

import java.util.Arrays;

/*
* https://leetcode.com/problems/squares-of-a-sorted-array/description/?envType=study-plan&id=algorithm-i
* Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
* */
public class SquaresOfSortedArray {


    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(item ->item * item ).sorted().toArray();
    }
}
