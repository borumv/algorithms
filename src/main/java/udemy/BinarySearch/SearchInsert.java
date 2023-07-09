package udemy.BinarySearch;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
https://leetcode.com/problems/search-insert-position/description/?envType=study-plan&id=algorithm-i
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right){
            mid = (left + right) / 2;

            if (mid > nums.length - 1 || ((nums[left] < target)&& (target< nums[right]))) {
                return mid;
            } else if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return mid;
    }
}
