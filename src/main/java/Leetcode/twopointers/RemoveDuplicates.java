package Leetcode.twopointers;

/*
* https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
*
* */
public class RemoveDuplicates {


    //0,0,1,1,1,1,2,3,3,5,5,5,5,7,7,7,9
    public int removeDuplicates(int[] nums) {
        /*
        * индекс, указывающий на текущую позицию в массиве nums, куда будет записан следующий уникальный элемент. Изначально i установлено в 0.
        * */
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }
}
