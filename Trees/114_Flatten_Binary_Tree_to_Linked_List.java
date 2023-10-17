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
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode node=root;
        while(node!=null){
            TreeNode temp=node.left;
            if(node.left!=null){
                temp=node.left;
                while(temp.right!=null){
                    temp=temp.right;
                }
                temp.right=node.right;
                node.right=node.left;
                node.left=null;

            }

            node=node.right;
        }
    }
}
