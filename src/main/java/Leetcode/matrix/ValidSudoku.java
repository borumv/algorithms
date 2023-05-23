package Leetcode.matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

//    char[][] input = {
//            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//    };

    //51R
    //52C
    //511SQ
    public boolean isValidSudoku(char[][] board) {
        Set<String> sets = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j=0; j<9; ++j){
                char label = board[i][j];
                if(label != '.') {
                    if(!(sets.add(board[i][j] + String.valueOf(i) + 'R')) ||
                            !(sets.add(board[i][j] + String.valueOf(j) + 'C')) ||
                                    !(sets.add(board[i][j] + String.valueOf(i / 3) + j / 3 + "SQ")))
                        return false;
                }
            }
        }
        return true;
    }
}
