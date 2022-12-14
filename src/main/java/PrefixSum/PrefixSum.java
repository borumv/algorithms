package PrefixSum;

public class PrefixSum {
    public static void main(String[] args) {
        int[] massive = new int[]{1,2,3,4};
        int [] prefixmassive = makeprefixsum(massive);
        System.out.println(prefixSum(prefixmassive, 0, 5));
    }

    private static int[] makeprefixsum(int[] massive) {
        int[] prefixsum = new int[massive.length];
        prefixsum[0] = massive[0];
        for (int i = 1; i < massive.length; i++) {
            prefixsum[i] = massive[i] + prefixsum[i - 1];
        }
        return prefixsum;
    }

    private static int prefixSum(int[] massive, int LEFT, int RIGHT) {
      return massive[RIGHT] - massive[LEFT];
    }
}
