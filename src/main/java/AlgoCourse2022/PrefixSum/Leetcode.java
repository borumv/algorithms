package AlgoCourse2022.PrefixSum;

public class Leetcode {

    public static void main(String[] args) {
        int[] testCase = new int[]{-1,-1,0,0,-1,-1};
        int sum =0;
        System.out.println(pivotIndex(testCase));

    }
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }

}
