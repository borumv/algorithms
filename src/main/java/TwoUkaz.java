public class TwoUkaz {
    public static void main(String[] args) {
        int[] sortedmassive = new int[]{1,3,5,7,8};
        System.out.println(getcountpairs(sortedmassive, 4));

    }

    private static int getcountpairs(int[] sortedmassive, int i) {
        int left = 0;
        int right = 0;
        int countpairs = 0;
        for (int j = 0; j < sortedmassive.length; j++) {
            while (right < sortedmassive.length && sortedmassive[right] - sortedmassive[j] <= i) {
                right++;
            }

            countpairs = countpairs + sortedmassive.length - right;
            System.out.println("left - " + j + "right - " + right);
        }
        return countpairs;

    }
}
