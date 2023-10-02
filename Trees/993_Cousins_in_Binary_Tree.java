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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int c=0;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }

                if((node.left!=null && node.right!=null)&& node.left.val==x && node.right.val==y){
                    return false;
                }
                if(c==0 && ((node.left!=null && node.left.val==x) || (node.right!=null && node.right.val==x ))){
                    c=1;
                }
                else if(c==1 && ((node.left!=null && node.left.val==y) || (node.right!=null && node.right.val==y))){
                    c=2;
                    return true;
                }

                else if(c==1 && ((node.left!=null && node.left.val==x) || (node.right!=null && node.right.val==x ))){
                    c=2;
                    return true;
                }
                else if(c==0 && ((node.left!=null && node.left.val==y) || (node.right!=null && node.right.val==y))){
                    c=1;
                }
                
            }
            if(c==1){
                return false;
            }
        }

        
        return false;
    }
}











