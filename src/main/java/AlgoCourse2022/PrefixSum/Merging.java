package AlgoCourse2022.PrefixSum;

public class Merging {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 8};
        int[] arr2 = new int[]{2, 4, 6, 7, 8, 10};
        int[] result = merging(arr, arr2);
        for (int j : result) {
            System.out.println(j);
        }

    }

    private static int[] merging(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int uArr1 = 0;
        int uArr2 = 0;
        for (int i = 0; i < result.length; i++) {
            if ((uArr1 <= arr1.length - 1) && arr1[uArr1] <= arr2[uArr2]) {
                result[i] = arr1[uArr1];
                uArr1++;
            } else if (uArr2 <= arr2.length - 1) {
                result[i] = arr2[uArr2];
                uArr2++;
            }
        }
        return result;
    }
}
