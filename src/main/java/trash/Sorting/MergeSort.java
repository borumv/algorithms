package trash.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] massive1 = new int[]{1,2};
        int[] massive2 = new int[]{2,3,6,7};
        int[] sorting = merging(massive1, massive2);
        for (int i = 0; i < sorting.length; i++) {
            System.out.println(sorting[i]);
        }
    }

    public static int[] merging(int[] massive1, int[]massive2){
        int index = 0;
        int index_first= 0;
        int index_second = 0;
        int sum_length = massive1.length + massive2.length;
        int[] sorting = new int[sum_length];
        while(index_first < massive1.length && index_second < massive2.length){
            if(massive1[index_first] > massive2[index_second]){
                sorting[index++] = massive2[index_second++];
            }else if (massive1[index_first] <= massive2[index_second]){
                sorting[index++] = massive1[index_first++];
            }
        }
        while (index_first < massive1.length){
            sorting[index++] = massive1[index_first++];
        }
        while (index_second < massive2.length){
            sorting[index++] = massive2[index_second++];
        }
         return sorting;
    }


}
