class Solution {
    int indx=0;
    Map<Integer,Integer> map=new HashMap<>();
    private TreeNode Construct(int[] preorder,int start,int end){
        while(start>end){
            return null;
        }
        int val=preorder[indx++];
        TreeNode root=new TreeNode(val);
        int rootidx=map.get(val);
        root.left=Construct(preorder,start,rootidx-1);
        root.right=Construct(preorder,rootidx+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return Construct(preorder,0,inorder.length-1);
    }
}