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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }

        Deque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        int x=0;
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int size=q.size();

            if(x%2==0){
                for(int i=0;i<size;i++){
                    TreeNode node=q.removeFirst   ();
                    temp.add(node.val);
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
            }
            else if(x%2!=0){
                for(int i=0;i<size;i++){
                    TreeNode node=q.removeLast();
                    temp.add(node.val);
                    if(node.right!=null){
                        q.addFirst(node.right);
                    }
                    if(node.left!=null){
                        q.addFirst(node.left);
                    }
                   
                }
            }
            list.add(temp);
            x++;
        }
        return list;
    }
}
