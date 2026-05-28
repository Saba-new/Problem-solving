class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int s = 0;
        k=k%n;
        int[] temp = new int[n];

        // store last k elements
        for(int i = n-k; i < n; i++) {
            temp[s] = nums[i];
            s++;
        }

        // store remaining elements
        for(int i = 0; i < n-k; i++) {
            temp[s] = nums[i];
            s++;
        }

        // copy back
        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}