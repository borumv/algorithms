package AlgoCourse2022.TwoPointers;

import java.util.stream.IntStream;

/*
* https://leetcode.com/problems/rotate-array/?envType=study-plan&id=algorithm-i
* Given an array, rotate the array to the right by k steps, where k is non-negative.
* */
public class RotateArray {
    public static void main(String[] args) {
        int[]array = new int[]{-1,-100,3,99};
        rotate(array, 2);
    }
    public static void rotate(int[] nums, int k) {
        int[] nums_copy = IntStream.concat(IntStream.of(nums), IntStream.of(nums)).toArray();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums_copy[i + k + 1];
        }
    }
}
