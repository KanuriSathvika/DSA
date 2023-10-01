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
    public TreeNode insertIntoBST(TreeNode root, int val) {
         TreeNode ans=new TreeNode(val);
        if(root==null){
            root=ans;
            return root;
        }

        TreeNode node=root;
       
        while(node!=null){
            
            if(node.left==null && node.val>val){
                node.left=ans;
                return root;
            }
            else if(node.right==null && node.val<val){
                node.right=ans;
                return root;
            }

            if(node.val>val){
                node=node.left;
            }
            else if(node.val<val){
                node=node.right;
            }

            
        }
        return root;
    }
}
