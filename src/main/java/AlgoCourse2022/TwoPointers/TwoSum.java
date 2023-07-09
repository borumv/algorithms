package AlgoCourse2022.TwoPointers;


/*
* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan&id=algorithm-i
* Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
* Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
* The tests are generated such that there is exactly one solution. You may not use the same element twice.
* Your solution must use only constant extra space.
* */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int rightIndex = numbers.length - 1;
        int leftIndex = 0;
        int[]result = new int[]{1,2};
        while (numbers[rightIndex] > target){
            rightIndex--;
        }
        while (numbers[leftIndex] > target){
            leftIndex++;
        }

        for (int i = leftIndex; i <= rightIndex; i++) {
            for (int j = i + 1; j <= rightIndex; j++) {
                if(numbers[i] + numbers[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break;
                }
            }
        }
        return result;
    }
}
