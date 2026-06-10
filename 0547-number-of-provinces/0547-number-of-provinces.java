class Solution {

    public void dfs(int start,boolean[] vis,int[][] mat,int n){
        vis[start] = true;
        for(int i=0;i<n;i++){
            if(vis[i] == false && mat[i][start] == 1){
                dfs(i,vis,mat,n);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i] == false){
                count++;
                dfs(i,vis,isConnected,n);
            }
        }
        return count;
    }
}