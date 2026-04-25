class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        back(res,new ArrayList<>(),nums);
        return res;
    }
    private static void back(List<List<Integer>>res,List<Integer>cur,int[]nums){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
        }
        for(int num:nums){
            if(cur.contains(num)) continue;

            cur.add(num);
            back(res,cur,nums);
            cur.remove(cur.size()-1);
        }
    }
}