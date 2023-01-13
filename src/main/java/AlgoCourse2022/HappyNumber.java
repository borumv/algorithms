package AlgoCourse2022;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 *     Starting with any positive integer, replace the number by the sum of the squares of its digits.
 *     Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 *     Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * https://leetcode.com/problems/happy-number/description/?envType=study-plan&id=level-2
 *
 */


public class HappyNumber {
    private int getNext(int n) {
        int totalSum = 0;
        while(n != 0){
            totalSum += (n % 10)*(n % 10);
            n = n /10;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
       Set<Integer> set = new HashSet<>();
       while (n != 1 && !set.contains(n)){
           set.add(n);
           n = getNext(n);
       }
       return n == 1;
    }
}
