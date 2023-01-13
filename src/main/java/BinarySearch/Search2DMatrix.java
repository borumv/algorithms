package BinarySearch;

//https://leetcode.com/problems/search-a-2d-matrix/?envType=study-plan&id=algorithm-ii
/*
* Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.
*
* */

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            int len_matrix = matrix[i].length - 1;
            if(matrix[i][len_matrix] >= target){
                index = i;
                break;
            }
        }
        int left = 0;
        int right = matrix[index].length - 1;
        boolean isPresent = false;
        while (left <= right){
            int m = (left + right) / 2;
            if(matrix[index][m] == target){
                isPresent = true;
                break;
            } else if (matrix[index][m] > target) {
                right = m - 1;
            } else if (matrix[index][m]< target) {
                left = m + 1;
            }
        }
        return isPresent;
    }
}
