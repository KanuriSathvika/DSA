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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                TreeNode temp=node.left;
                node.left=node.right;
                node.right=temp;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }

            }
        }
        return root;
    }
}
