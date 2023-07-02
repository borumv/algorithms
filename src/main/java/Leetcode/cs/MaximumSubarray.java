package Leetcode.cs;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        // {-2,1,-3,4,-1,2,1,-5,4}; -2  + 1 = -1
        while (j <= nums.length - 1){
            if(sum < 0 && nums[j] >=  sum){
                sum = 0;
            }
            sum += nums[j];
            max = Math.max(sum, max);
            j++;
        }
        return max;
      }
}
