class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;

        while (top <= bottom && left <= right) {

            // top row
            for (int i = left; i <= right; i++)
                res.add(matrix[top][i]);
            top++;

            // right column
            for (int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
            right--;

            // bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom--;
            }

            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left++;
            }
        }

        return res;
    }
}
