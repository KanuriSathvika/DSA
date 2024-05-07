/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        if(node==null){
            return ans;
        }
        
        Node head=node;
        Queue<Node> q=new LinkedList<>();
        q.add(head);
        while(!q.isEmpty()){
            Node temp=q.poll();
            ans.add(0,temp.data);
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
        }
        return ans;
    }
} 
