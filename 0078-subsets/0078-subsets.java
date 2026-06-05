class Solution {
    
    List<List<Integer>> result=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        dfs(0,nums,new ArrayList<>());
        return result;
    }

    public void dfs(int index,int[]nums,List<Integer>current){
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        dfs(index+1,nums,current);

        current.remove(current.size()-1);
        dfs(index+1,nums,current);
    }
}