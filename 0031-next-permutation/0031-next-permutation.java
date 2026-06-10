class Solution {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // Find pivot
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }

        // Find next greater and swap
        if(pivot != -1){
            for(int j = n - 1; j > pivot; j--){
                if(nums[j] > nums[pivot]){
                    int temp = nums[j];
                    nums[j] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }

        // Reverse the suffix
        reverse(nums, pivot + 1, n - 1);
    }

    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}