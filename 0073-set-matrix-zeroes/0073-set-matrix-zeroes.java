class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] markRow = new boolean[rows];
        boolean[] markCol = new boolean[cols];

        // Step 1: mark rows & columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    markRow[i] = true;
                    markCol[j] = true;
                }
            }
        }

        // Step 2: set zeroes
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (markRow[i] || markCol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
