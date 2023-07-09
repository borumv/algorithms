package trash.SellAndNotSell;

import java.util.Arrays;
import java.util.List;

public class SellTestSecond {
    public static void main(String[] args) {
        System.out.println(distributeCookies(new int[]{1,2,3,4,5,6,7,8}, 5));
    }
    static int res = Integer.MAX_VALUE;
    public static int distributeCookies(int[] cookies, int k) {
        dfs(cookies, 0, k, new int[k]);
        return res;
    }

    static  void  dfs(int[] cookies, int cur, int k, int[] children) {
        if (cur == cookies.length) {
            int max = 0;
            for (int c : children) max = Math.max(max, c);
            res = Math.min(res, max);
            return;
        }
        for (int i = 0; i < k; i++) {
            children[i] += cookies[cur];
            dfs(cookies, cur + 1, k, children);
            children[i] -= cookies[cur];
        }
    }

//    static  void  dfs(List<Integer> cookies, int cur, int k,List<String, List<Integer>> children) {
//        if (cur == cookies.size()) {
//            int max = 0;
//            for (Integer c : children) max = Math.max(max, c);
//            res = Math.min(res, max);
//            return;
//        }
//        for (int i = 0; i < k; i++) {
//            children[i] += cookies[cur];
//            dfs(cookies, cur + 1, k, children);
//            children[i] -= cookies[cur];
//        }
//    }

    /*
        massive = {1,3,4,5,6,7,9,11,13}
        parts = 3
        target = 19
        prefix_sum_massive = {1,4,8,13,19,26,35,46,59}
        first =
     */
       /*
        massive = {1,3,4,5,6,7,9,11,13}
        parts = 3
        target = 19
       1 step
       massive = {3,4,5,6,7,9,11}
       first = 14

       2 step = {4,5,6,7,9,11}
       first = 17 {1,13,3}

       3 step = {5,6,7,9}
       second = 15 {4,11}

       4 step = {6,7,9}
       second = 20 {4,11,5}

       5 step
       third = 22 {6,7,9}
     */


}
