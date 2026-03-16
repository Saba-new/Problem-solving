class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int top = 0;
        int bottom = m - 1;

        while (top <= bottom) {

            int mid = (top + bottom) / 2;

            int maxCol = 0;

            for (int j = 0; j < n; j++) {
                if (mat[mid][j] > mat[mid][maxCol]) {
                    maxCol = j;
                }
            }

            int up = mid - 1 >= 0 ? mat[mid - 1][maxCol] : -1;
            int down = mid + 1 < m ? mat[mid + 1][maxCol] : -1;

            if (mat[mid][maxCol] > up && mat[mid][maxCol] > down) {
                return new int[]{mid, maxCol};
            }

            if (up > mat[mid][maxCol]) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}