package udemy.BinarySearch;
/*
* https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=study-plan&id=algorithm-ii
*
* */

public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int left = -1;
        int right = -1;
        if(r == 0 && nums[0] == target){
            return new int[]{0,0};
        }
        while (l <= r){
            int m = (l + r)/2;
            if(nums[m] == target){
                boolean flagRight = true;
                boolean flagLeft = true;
                left = m;
                right = m;
                while (flagRight){
                    if(right < r && nums[right + 1] == target){
                        right++;
                    }else {
                        flagRight = false;
                    }
                }
                while (flagLeft){
                    if(left > 0 && nums[left - 1] == target){
                        left--;
                    }else {
                        flagLeft = false;
                    }
                }
                break;
            } else if (l==r && nums[m] != target) {
                return new int[]{left,right};
            } else if (nums[m] > target) {
                r = m;
            }else {
                l = m + 1;
            }
        }
        return new int[]{left, right};
    }
}
