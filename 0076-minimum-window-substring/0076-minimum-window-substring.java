class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int left=0;
        int min=Integer.MAX_VALUE;
        int count=t.length();
        int start=0;
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()<t.length()){
            return "";
        }
        
        for(char c:t.toCharArray()){
           
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int right=0;right<n;right++){
            char r=s.charAt(right);
            if(map.containsKey(r)){
                if(map.get(r)>0){
                    count--;
                }
                map.put(r,map.get(r)-1);
            }
            while(count==0){
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;

                }
                char l=s.charAt(left);
                if(map.containsKey(l)){
                    map.put(l,map.get(l)+1);
                
                if(map.get(l)>0){
                    count++;
                }
            }

            
            left++;
        }
    }
        return min==Integer.MAX_VALUE ? "" : s.substring(start,start+min);
        
    }
}