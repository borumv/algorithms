package udemy.BitMasks;

import java.util.ArrayList;
import java.util.List;

public class Bitmask {
    public static void main(String[] args) {
        String[] massive = new String[]{"12","2313", "3","333"};
        int count = massive.length;
        for (int mask = 0; mask < (1 << count); mask++) {
            for (int j = 0; j < count; j++) {
                if((mask & (1<<j)) != 0){
                    System.out.print(massive[j] + " ");
                }
            }
            System.out.println();
        }

    }

    public List<List<Integer>> subsets(int[] nums) {
        int count = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int mask = 0; mask < (1<<count); mask ++){
            List<Integer> sub_set = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                if((mask & (1<<i)) != 0){
                    sub_set.add(nums[i]);
                }
            }
            result.add(sub_set);
        }

        return result;
    }
}
