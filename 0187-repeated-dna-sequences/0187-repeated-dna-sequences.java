class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int left=0;

        if(s.length()<10){
            return res;
        }
        for(int right=0;right<s.length();right++){
           int count=0;
           int size=right-left+1;;
            if(size==10){
                 String sub=s.substring(left,right+1);
                 map.put(sub,map.getOrDefault(sub,0)+1);

                 if(map.get(sub)==2){
                    res.add(sub);
                 }  
                 left++;         
            }
            

        }
        return res;
    }
}