package Leetcode.DynamicProg;
/*
 * https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
 *
 * */

public class JumpGame {

    //Input: nums = [2,3,1,1,4]
    // [2 + 1 + 1]

    //    int reachable = 0;
    //    for (int i=0; i<nums.length; ++i) {
    //        if (i > reachable) return false;
    //        reachable = Math.max(reachable, i + nums[i]);
    //    }
    //    return true;
    public boolean canJump(int[] nums) {

        if (nums.length == 1) {
            return true;
        }
        for (int i = 0; i < nums.length; ) {
            if (nums[i] >= nums.length - 1) {
                return true;
            }
            if (nums[nums[i]]  == 0 && i < nums.length - 1) {
                return false;
            }
            i += nums[i] + nums[nums[i]];
            if (i >= nums.length) {
                return true;
            }

        }
        return false;
    }
}
