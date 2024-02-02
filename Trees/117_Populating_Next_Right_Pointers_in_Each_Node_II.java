/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }

        // Treenode node=root;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=0;
        while(!q.isEmpty()){
            Node temp=q.remove();
            // if(!q.isEmpty() &&temp==root && i==0 ){

            // }
            if(!q.isEmpty() && i>1){
                temp.next=q.peek();
                i=i-1;
            }
            else if( i==1){
                temp.next=null;
                i=i-1;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(i==0){
                 i=q.size();
            }
           
        }
        return root;

    }
}
