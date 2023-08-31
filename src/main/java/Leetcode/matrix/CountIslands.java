package Leetcode.matrix;
public class CountIslands {
    int countIslands(char[][] grid){
        char[][] stepped = new char[grid[0].length][grid.length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1' && stepped[i][j] != 'x'){
                    detectIsland(grid, stepped, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void detectIsland(char[][] grid, char[][] stepped, int i, int j) {

        if(i + 1 < grid.length - 1 && j  + 1< grid[0].length - 1 ){
            return;
        }

        while (((grid[i + 1][j] == '1' && grid[i][j + 1] == '1' &&
                (stepped[i + 1][j] != 'x' || stepped[i][j + 1] != 'x')))){
            if(grid[i + 1][j] == '1' && stepped[i + 1][j] != 'x'){
                stepped[i + 1][j] = 'x';
                detectIsland(grid,stepped,i + 1,j);
            }
            if(grid[i][j + 1] == '1' && stepped[i][j + 1] != 'x'){
                stepped[i][j + 1] = 'x';
                detectIsland(grid,stepped,i,j + 1);
            }
        }
    }
}
