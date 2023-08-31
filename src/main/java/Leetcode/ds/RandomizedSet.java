package Leetcode.ds;

import java.util.*;

/**
 * https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
public class RandomizedSet {

    Set<Integer> setInteger = new HashSet<>();
    List<Integer> bank = new ArrayList<>();

    Random random = new Random();

    public RandomizedSet() {

    }

    public boolean insert(int val) {

        if (setInteger.contains(val)) {
            return false;
        } else {
            setInteger.add(val);
            bank.add(val);
            return true;
        }
    }

    public boolean remove(int val) {

        if (setInteger.contains(val)) {
            setInteger.remove(val);
            bank.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {

        return bank.get(random.nextInt(bank.size()));
    }
}
