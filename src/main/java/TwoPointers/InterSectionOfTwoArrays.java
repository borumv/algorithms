package TwoPointers;
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=study-plan&id=data-structure-i
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterSectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arrayList = new ArrayList<>();
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i : nums1) {
            numsMap.merge(i, 1, Integer::sum);
        }
        for (int i : nums2) {
            if(numsMap.containsKey(i) && numsMap.get(i) > 0){
                arrayList.add(i);
                int currentValue = numsMap.get(i); // получаем текущее значение
                numsMap.put(i, currentValue - 1); // записываем обновленное значение в Map
            }
        }

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
