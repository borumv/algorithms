package Leetcode.DynamicProg;

public class MinCostClimbingStairs {
//*
// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
//
//You can either start from the step with index 0, or the step with index 1.
//
//Return the minimum cost to reach the top of the floor.
//Вам дан целочисленный массив cost, где cost[i] — стоимость i-й ступени лестницы.
//Как только вы заплатите стоимость, вы можете подняться на одну или две ступеньки.
//
//Вы можете начать либо с шага с индексом 0, либо с шага с индексом 1.
//
//Верните минимальную стоимость, чтобы достичь вершины этажа.
//Переведено с Google (English → Russian)
// /
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int first = cost[0];
        int second = cost[1];
        if (n<=2) return Math.min(first, second);
        for (int i=2; i<n; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);
    }
}
