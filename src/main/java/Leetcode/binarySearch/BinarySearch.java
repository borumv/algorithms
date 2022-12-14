package Leetcode.binarySearch;

public class BinarySearch {
//    public static void main(String[] args) {
//        int[] values = new int[]{5};
//        System.out.println(search(values, 5));
//    }
    public int search(int[] nums, int target) {
        int leftIndex = 0;
        int mid = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex  <= rightIndex){
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                rightIndex = mid - 1;
                mid = leftIndex;
            } else if (nums[mid] < target) {
                leftIndex = mid + 1;
                mid = rightIndex;
            }

        }

        return -1;
    }
}
