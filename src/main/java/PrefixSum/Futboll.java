package PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Futboll {
    public static void main(String[] args) {
        int[] players = new int[]{1, 4, 5, 3, 2, 6, 8, 9};

        int best = searchBestCombination(players);
        System.out.println(best);
    }

    private static int searchBestCombination(int[] players) {
        List<Integer> bestTeam = getIntegers(players);
        int pointsOfStrongerTeam = 0;
        int points = 0;
        for (int i = bestTeam.size() - 1; i >= 0; i--) {
            int j = i - 1;
            while (j > 0 && (bestTeam.get(j) + bestTeam.get(j - 1) > bestTeam.get(i))) {
                points += bestTeam.get(i) + bestTeam.get(j) + bestTeam.get(j - 1);
                j--;
            }
            pointsOfStrongerTeam = Math.max(points, pointsOfStrongerTeam);
            points = 0;
        }
        return pointsOfStrongerTeam;


    }

    private static List<Integer> getIntegers(int[] players) {
        List<Integer> bestTeam = new ArrayList<>();
        Arrays.sort(players);
        for (int player : players) {
            bestTeam.add(player);
        }
        return bestTeam;
    }
}
