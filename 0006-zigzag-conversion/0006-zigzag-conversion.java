class Solution {
    public String convert(String s, int numRows) {

        // If only one row, no zigzag
        if (numRows == 1)
            return s;

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++)
            rows[i] = "";

        int row = 0;
        int step = 1;   // 1 = down, -1 = up

        for (int i = 0; i < s.length(); i++) {
            rows[row] += s.charAt(i);

            // Change direction at top or bottom
            if (row == 0)
                step = 1;
            else if (row == numRows - 1)
                step = -1;

            row += step;
        }

        // Combine rows
        String result = "";
        for (int i = 0; i < numRows; i++)
            result += rows[i];

        return result;
    }
}
