class Solution {
    public String longestCommonPrefix(String[] strs) {
       String x=strs[0];
      for(int i=0;i<strs.length;i++){
        while(!strs[i].startsWith(x)){
            x=x.substring(0,x.length()-1);
            if(x.isEmpty())return "";

        }
      }
       return x;
    }
    
}
