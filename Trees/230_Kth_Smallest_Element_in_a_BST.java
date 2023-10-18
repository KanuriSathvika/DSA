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
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode ans=smallest(root,k);

        if(ans!=null){
             return ans.val;
        }
        return -1;
    }
    public TreeNode smallest(TreeNode root,int k){
         if(root==null){
            return null;
        }
        // count++;
        TreeNode leftside=smallest(root.left,k);
        if(leftside!=null){
            System.out.println(count +" "+ leftside.val);
            return leftside;
        }
        count++;
        
        if(count==k){
            return root;
        }
        return smallest(root.right,k);
    }
}
