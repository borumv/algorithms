//package Leetcode.slidingwindow;
//import java.util.Arrays;
//
//public class MinSubArrayLen {
//    //
//    //int target = 7
//    //
//    // l           r
//    // 2, 3, 1, 2, 4, 3
////1, 2, 3, 3, 4
//
//    public int minSubArrayLen(int t, ) {
//
//        Arrays.sort(nums);
//        int sum = nums[nums.length - 1];
//        int max = 0, count = 0;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            if (sum >= target) {
//                count++;
//                return count;
//            } else {
//                sum += nums[i];
//                count++;
//            }
//        }
//        if (sum >= target) {
//            return ++ count;
//        } else {
//            return 0;
//        }
//
//    }
