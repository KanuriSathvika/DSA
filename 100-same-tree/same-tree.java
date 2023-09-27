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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }

        if((p==null && q!=null) ||(p!=null && q==null)){
            return false;
        }
        Queue<TreeNode> list1=new LinkedList<>();
        Queue<TreeNode> list2=new LinkedList<>();
        list1.add(p);
        list2.add(q);
        if(p.val!=q.val){
            return false;
        }
        while(!list1.isEmpty() && !list2.isEmpty()){
            int s1=list1.size();
            int s2=list2.size();
            if(s1!=s2){
                return false;
            }
            else if(s1==s2){
                for(int i=0;i<s1;i++){
                    TreeNode node1=list1.remove();
                    TreeNode node2=list2.remove();
                    
                    if(node1.left!=null && node2.left!=null){
                        list1.add(node1.left);
                        list2.add(node2.left);
                        if((node1.left!=null && node2.left!=null) && node1.left.val!=node2.left.val){
                            return false;
                        }
                    }
                    else if((node1.left==null && node2.left!=null) || (node1.left!=null && node2.left==null)){
                        return false;
                    }
                    if(node1.right!=null && node2.right!=null){
                        list1.add(node1.right);
                         list2.add(node2.right);
                         if((node1.right!=null && node2.right!=null)&& (node2.right.val!=node1.right.val)){
                             return false;
                         }
                    }
                    else if((node1.right==null && node2.right!=null) || (node1.right!=null && node2.right==null)){
                        return false;
                    }
                    // if(node2.left!=null){
                    //     list2.add(node2.left);
                    // }
                    // if(node2.right!=null){
                    //     list2.add(node2.right);
                    // }
                    // if(() && node1.left.val!=node2.left.val){
                    //     return false;
                    // }
                    //  if(node1.right.val!=node2.right.val){
                    //     return false;
                    // }
                }
            }
            // else{
            //     return false;
            // }
        }
        return true;
    }
}