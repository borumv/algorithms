package epam;

import java.util.*;

public class Questions {

    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 2, 1, 5, 7};
        insertionSort(array);
        System.out.println(Arrays.toString(Arrays.stream(array).toArray()));
    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            var cur = array[i];
            var j = i - 1;
            while (j >= 0 && array[j] > cur) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = cur;
        }
    }


}
