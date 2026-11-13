/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<Double> res=new ArrayList<>();
        if(res==null){
            return res;
        }
        while(!q.isEmpty()){
            double sum=0.0; 
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
               
                sum+=n.val;
                if(n.left!=null )  q.offer(n.left);
                if(n.right!=null)  q.offer(n.right); 


            }
            res.add(sum/size);
        }
        return res;
    }
}