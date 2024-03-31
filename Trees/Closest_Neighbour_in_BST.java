// User function Template for Java

/*class Node
{
    int key;
    Node left, right;

    Node(int x)
    {
        key = x;
        left = right = null;
    }

}*/
class Solution {
    public static int findMaxForN(Node root, int n) {
        // Add your code here.
        if(root==null){
            return -1;
        }
        
        
        Node node=root;
        int prev=-1;
        while(node!=null){
            if(prev<node.key && node.key<=n){
                prev=node.key;
            }
            
            if(node.key<n){
                node=node.right;
            }
            else if(node.key>n){
                node=node.left;
            }
            else{
                break;
            }
        }
        return prev;
    }
}
