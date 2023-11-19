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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){
            return null;
        }
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++){
            TreeNode node=new TreeNode(preorder[i]);
            if(root==null){
                root=node;
            }
            else{
                TreeNode prev=null;
                TreeNode temp=root;
                while(temp!=null){
                    if(node.val<temp.val){
                        prev=temp;
                        temp=temp.left;
                    }
                    else if(node.val>=temp.val){
                        prev=temp;
                        temp=temp.right;
                    }
                }
                if(prev.val>node.val){
                    prev.left=node;
                }
                else if(prev.val<=node.val){
                    prev.right=node;
                }
            }
        }
        return root;
    }
}
