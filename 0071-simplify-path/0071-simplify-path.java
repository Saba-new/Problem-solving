class Solution {
    public String simplifyPath(String path) {

        String[]arr=path.split("/");
        Stack<String> st=new Stack<>();
        for(String ch:arr){
            if(ch.equals("")||ch.equals(".")){
                continue;
            }
            else if(ch.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
           
        }
        StringBuilder sb=new StringBuilder();
        for(String s:st){
            sb.append('/').append(s);
        }
        if(sb.length()==0){
            return "/";
        }
        return sb.toString();
    }
}