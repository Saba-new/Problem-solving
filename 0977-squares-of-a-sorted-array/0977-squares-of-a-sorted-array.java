class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        
        int[] s=new int[n];

        for(int i=0;i<n;i++){
            s[i]=nums[i]*nums[i];
        
        }
        Arrays.sort(s);
        return s;
    }
}