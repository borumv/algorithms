package Leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/spiral-matrix/?envType=study-plan-v2&envId=top-interview-150
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * */
public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        // toRight -> toBottom -> toLeft -> toUp
        int leftColumn = 0;
        int rightColumn = matrix[0].length - 1;
        int upLine = 0;
        int bottomLine = matrix.length - 1;
        List<Integer> spiralMatrix = new ArrayList<>(matrix.length * matrix[0].length);
        while (leftColumn <= rightColumn && upLine <= bottomLine) {
            //to right
            for (int i = leftColumn; i <= rightColumn; i++) {
                spiralMatrix.add(matrix[upLine][i]);
            }
            upLine++;
            //to bot
            for (int i = upLine; i <= bottomLine; i++) {
                spiralMatrix.add(matrix[i][rightColumn]);
            }
            rightColumn--;
            //to left
            if (upLine <= bottomLine) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    spiralMatrix.add(matrix[bottomLine][i]);
                }
            }
            bottomLine--;
            //to up
            if ( leftColumn <= rightColumn) {
                for (int i = bottomLine; i >= upLine; i--) {
                    spiralMatrix.add(matrix[i][leftColumn]);
                }
            }
            leftColumn++;
        }
        return spiralMatrix;

    }
}
