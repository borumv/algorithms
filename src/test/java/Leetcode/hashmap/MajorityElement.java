package Leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
* */
public class MajorityElement {

    //[2,2,1,1,1,2,2]
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.merge(num, 1, (oldValue, newValue) -> oldValue + newValue);
            if (count.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;

    }
}
