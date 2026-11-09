class Solution {
    public int trap(int[] height) {
       Stack<Integer> st=new Stack<>();
       int total=0;
       int n=height.length;
       for(int i=0;i<n;i++){
       
        while(!st.isEmpty()&& height[i]>height[st.peek()]){
            int low=st.pop();
            if(st.isEmpty()){
                break;
            }
            int peek=st.peek();
            int width=i-peek-1;

            int min=Math.min(height[peek],height[i])-height[low];

            total+=width*min;

        }

        st.push(i);
       }
      

       return total;
       
    }
}