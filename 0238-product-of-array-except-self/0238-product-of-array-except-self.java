class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        left[0]=1;
        int i;
        for(i=1;i<=n-1;i++)  //left = [ 1, 1 , 2 , 6 ]
        {
            left[i]=left[i-1]*nums[i-1];
            //left[1] = left[2] * nums[0]
                      //  2 * 3 = 6
        }
         
        right[n-1] = 1;

        for(i=n-2;i>=0;i--) //right = []
        {
            right[i]=right[i+1] * nums[i+1];
            //right[2] = right[3] * nums[3] = 1 * 4 = 4
            //right[1] = right[2] * nums[2] = 4 * 3 = 12 
            //right[0] = right[1] * nums[1] = 12 * 2 = 24
        }

        for(i=0;i<=n-1;i++)
        {
            ans[i]=left[i] * right[i];
                    //1 * 24 
                    //1 * 12 
                    //2 * 4
                    //6 * 1   
        }
        return ans;
    }
}
