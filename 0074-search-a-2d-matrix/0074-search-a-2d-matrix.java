class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;

        int left=0;
        int right=row*col -1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int curr=matrix[mid/col][mid%col];
        if(curr==target) return true;
        if(curr<target) left=mid+1;
        else right=mid-1;
        }
            return false;

    }
}