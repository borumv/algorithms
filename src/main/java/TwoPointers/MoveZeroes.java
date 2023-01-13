package TwoPointers;


/*
* https://leetcode.com/problems/move-zeroes/?envType=study-plan&id=algorithm-i
* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
* Note that you must do this in-place without making a copy of the array.
* */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == 0 && nums[j] != 0){
                    int num = nums[j];
                    nums[i] = num;
                    nums[j] = 0;
                }
            }
        }
      }

}
