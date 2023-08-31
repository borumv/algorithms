package Leetcode.DynamicProg;

import java.util.concurrent.atomic.AtomicInteger;

//*
// https://leetcode.com/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150
// */
public class JumpGame2 {

    //2,3,1,1,4
    //
    public int jump(int[] nums) {

        if (nums.length <= 1) {
            return 0;
        }
        int ladder = nums[0];
        int stairs = nums[0];
        int jump = 1;
        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return jump;
            }
            if (i + nums[i] > ladder) {
                ladder = i + nums[i];
            }
            stairs--;
            if (stairs == 0) {
                jump++;
                stairs = ladder - i;
            }
        }
        return jump;
    }

    public int jumps(int[] nums) {
        int minLevel = nums.length;
        path(nums, 0, 0, 1);
        return minLevel;
    }

    void path(int[] num, int index, int level, int minLevel) {
        if (index >= num.length - 1) { // ƒобавлено условие остановки рекурсии
            if (level < minLevel) {
                minLevel = level;
            }
            return;
        }
        for (int i = index; i <= num[index] + index; i++) {
            path(num, i, level + 1, minLevel);
        }
    }
}
