package Leetcode.DynamicProg;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int[]count = new int[n + 1];
        count[0] = 1;
        count[1] = 2;
        for (int i = 2; i < n ; i++) {
            count[i] = count[i - 1] + count[i - 2];
        }
        return count[n - 1];
        /*
        / n = 4
           1) 1 - 1 - 1 - 1
           2) 1 - 1 - 2
           3) 2 - 1 - 1
           4) 2 - 2
           5) 1 - 2 - 1

          n = 5
            1) 1-1-1-1-1
            2) 1-1-1-2
            3) 2-1-1-1
            4) 1-2-1-1
            5) 1-1-2-1
            6) 2-2-1
            7) 2-1-2
            8) 1-2-2
            9) 1-1-2
            10) 1-2-1
            11) 2-1-1

         */

    }
}
