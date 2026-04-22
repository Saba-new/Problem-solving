class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(c);
        back(c,t,0,new ArrayList<>(),res);
        return res;

    }
    private void back(int c[],int t,int start,List<Integer>cur,List<List<Integer>>res){

        if(t==0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=start;i<c.length;i++){
            if(c[i]>t){
                break;
            }
            if(i>start && c[i]==c[i-1]) continue;

            cur.add(c[i]);
            back(c,t-c[i],i+1,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}