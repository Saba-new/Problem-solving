class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char s:ransomNote.toCharArray()){
            if(!map.containsKey(s)){
                return false;
            }
            if(map.get(s)==0){
                return false;
            }
            map.put(s,map.get(s)-1);
        }
        return true;
    }
}