package Leetcode.matrix;


/*
/In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size
r x c keeping its original data.
You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted
reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix..
https://leetcode.com/problems/reshape-the-matrix/description/?envType=study-plan&id=data-structure-i
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int rowsCount = mat.length;
        int columnsCount = mat[0].length;

        int outputRows = 0;
        int outputCols = 0;

        if(!(rowsCount * columnsCount == r * c)) {
            return mat;
        }
            for (int i = 0; i < rowsCount; i++) {
                for (int j = 0; j < columnsCount; j++) {
                    result[outputRows][outputCols] = mat[i][j];
                    outputCols++;
                    if(outputCols == c){
                        outputRows++;
                        outputCols = 0;
                    }
                }
            }

        return result;
    }
}
