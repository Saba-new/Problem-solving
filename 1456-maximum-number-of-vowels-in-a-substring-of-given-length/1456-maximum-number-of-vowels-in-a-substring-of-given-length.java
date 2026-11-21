class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int left=0;
        int max=0;
        int count=0;

        for(int right=0;right<n;right++){
            
                if(isVowel(s.charAt(right))){
                count++;
            }
           if(right-left+1>k){
            if(isVowel(s.charAt(left))){
                count--;
            }
            left++;
           }
           if(right-left+1==k){
            max=Math.max(max,count);
           }
           
        }
        return max;
        
    }
    public boolean isVowel(char c){
        return c=='a'|| c=='a' || c=='e'|| c=='i' || c=='o'|| c=='u';
    }
}