class Solution {
    public int lower(int[]nums, int target){
        int left=0;
        int right=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
                return left;
        
    }
    public int upper(int[]nums, int target){
        int left=0;
        int right=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
            return left;
        
    }

    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int len=nums.length;
        int right=len-1;
        int[]n={-1,-1};
        int low=lower(nums,target);
        int up = upper(nums,target);
        if(low>=len||nums[low]!=target)
        {
            return n;
        }
        else if(up==0||nums[up-1]!=target)
        {
            return n;
        }
        n[0]=low;
        n[1]=up-1;
        return n;


    }
}