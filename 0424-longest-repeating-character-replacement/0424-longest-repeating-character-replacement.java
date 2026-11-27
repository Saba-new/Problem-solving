class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int right=0;right<s.length();right++){
            char c=s.charAt(right);
             map.put(c,map.getOrDefault(c,0)+1);
             max=Math.max(max,map.get(c));
           
        while((right-left+1)-max>k){
            char l=s.charAt(left);
            map.put(l,map.get(l)-1);
            left++;
        }
        maxLen=Math.max(maxLen,right-left+1);
        }
    return maxLen;
        
    }
}