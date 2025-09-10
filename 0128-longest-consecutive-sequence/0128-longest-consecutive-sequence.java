class Solution {
    public int longestConsecutive(int[] nums) {
        if( nums==null||nums.length==0){
            return 0;
        }
        Set<Integer> s = new HashSet<>();
        for(int a:nums){
            s.add(a);
        }
        int ml=0;

        for(int b:s){
            if(!s.contains(b-1)){
                int cn=b;
                int cl=1;
            
            while(s.contains(cn+1)){
                cn++;
                cl++;
            }
           ml=Math.max(ml,cl);
        }
    }
    return ml;
    }
}