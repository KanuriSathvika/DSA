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
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null){
            return true;
        }
        if(root.left==null || root.right==null){
            return false;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        while(!q.isEmpty()){
            int size= q.size();

            for(int i=0;i<size;i++){
                TreeNode nleft=q.poll();
                TreeNode nright=q.poll();
                 if((nleft==null && nright!=null) || (nleft!=null && nright==null) )   {
                     return false;
                 }

                if((nleft!=null && nright!=null) && nleft.val!=nright.val){
                    return false;
                }

                if((nleft!=null && nright!=null)){ 
                    q.add(nleft.left);
                    q.add(nright.right);
                }

                if((nleft!=null && nright!=null) ){ 
                    q.add(nleft.right);
                    q.add(nright.left);
                }


            }
            
        }
        return true;
        
    }
}
