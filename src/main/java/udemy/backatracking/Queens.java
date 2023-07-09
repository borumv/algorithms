package udemy.backatracking;

/*
 * O(!n)
 * */

public class Queens {

    /*
     * 01000000
     * 10100000
     * 00010000
     * 00001000
     * 00000100
     * 00000010
     * 00000001
     * 00000000
     * */
    //row + column

    public static void main(String[] args) {

        for (int i = 1; i < 12; i++) {
            int[] col = new int[i];
            int[] diag = new int[i * 2 - 1];
            int[] diag2 = new int[i * 2 - 1];
            System.out.println(i + " -> " + queens(0, col, diag, diag2));
        }
    }
    public static int queens(int row, int[] col, int[] diag, int[] diag2) {

        int n = col.length;
        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int column = 0; column < n; column++) {
            if(col[column] == 0 && diag[row + column] == 0 && diag2[(column - row) + ( n - 1)] == 0){
                col[column] = diag[row + column] = diag2[(column - row) + ( n - 1)] = 1;
                count += queens(row + 1, col, diag, diag2);
                col[column] = diag[row + column] = diag2[(column - row) + ( n - 1)] = 0;
            }
        }
        return count;
    }
}
