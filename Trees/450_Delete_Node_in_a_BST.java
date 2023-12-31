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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        else if(root.val==key && root.left==null && root.right==null){
            return null;
        }
        TreeNode prev=null;
        TreeNode node=root;
        while(node!=null){
            if(node.val<key){
                prev=node;
                node=node.right;
            }
            else if(node.val>key){
                prev=node;
                node=node.left;
            }
            else{
                if(prev==null && node.left!=null){
                    root=node.left;
                }
                else if(prev==null && node.right!=null){
                    root=node.right;
                }

                if(prev!=null && node.left==null && node.right==null){
                    node=null;
                    if(prev.val<key){
                        prev.right=null;
                    }
                    else if(key<prev.val){
                        prev.left=null;
                    }
                    return root;
                }

                else if(prev!=null && node.left==null && node.right!=null){
                    if(prev.val<key){
                        prev.right=node.right;
                    }
                    else{
                        prev.left=node.right;
                    }
                    return root;
                }

                else if(prev!=null && node.left!=null && node.right==null){
                   
                    if(prev.val<key){
                         prev.right=node.left;
                    }
                    else{
                        prev.left=node.left;
                    }
                    return root;
                }

                if(prev!=null && prev.val<key){
                    prev.right=node.left;
                }
                else if(prev!=null && prev.val>key){
                    prev.left=node.left;
                }
                
                TreeNode temp=node;
                if(node.left!=null){
                    temp=node.left;
                }
                else if(node.right!=null){
                    temp=node.right;
                    return root;
                }

                while(temp.right!=null){
                    temp=temp.right;
                }
                temp.right=node.right;
                node.left=null;
                node.right=null;
                return root;
            }
        }
        return root;
    }
}
