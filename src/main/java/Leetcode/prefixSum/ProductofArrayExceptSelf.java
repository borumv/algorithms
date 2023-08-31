package Leetcode.prefixSum;

//*
// https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=top-interview-150

// */
public class ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        int right=1; int left=1;
        //{              1,         a[0],    a[0]*a[1],    a[0]*a[1]*a[2],  }
        //{ a[1]*a[2]*a[3],    a[2]*a[3],         a[3],                 1,  }
        for(int i=0;i<n;i++){
            res[i]=1;
        }
        for (int i=0;i<n;i++) {
            res[i]*=left;
            left*=nums[i];
        }
        for(int i=n-1;i>=0;i--) {
            res[i]*=right;
            right*=nums[i];
        }
        return res;
    }
}
