class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int m=0;
       for(int i=0;i<n;i++){
            m^=i;
            m^=nums[i];
            
       }
       m^=n;
       return m;
    }
}