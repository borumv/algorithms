package AlgoCourse2022;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        while (left != right && top != bottom){
            //go from left to right
            for (int i = left; i <=right ; i++) {
                result.add(matrix[top][i]);
            }
            //change top
            top += 1;

            //go from top to bottom
            for (int i = top; i < bottom; i++) {
                result.add(matrix[right][i]);
            }
            //change right
            right -= 1;

            //go from right bottom to left bottom
            for (int i = right; i >=left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom -= 1;

            //go from bottom to top
            for (int i = bottom; i < top - 1; i++) {
                result.add(matrix[left][i]);
            }
            left += 1;
        }
        return result;
    }
}
