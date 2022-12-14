package Leetcode.DynamicProg;

public class Fibonachi {

    public int fib(int n) {
        if (n == 0)
            return 0;
        int[]fibCount = new int[n + 1];
        fibCount[0] = 0;
        fibCount[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibCount[i] = fibCount[i - 1] + fibCount[i - 2];
        }
        return fibCount[n];
    }
}
