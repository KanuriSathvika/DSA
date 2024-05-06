/*  A Binary Tree nodea
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
    
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(node==null){
            ans.add(-1);
            return ans;
        }
        
        Node head=node;
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.left!=null && temp.right==null){
                ans.add(0,temp.left.data);
            }
            else if(temp.left==null && temp.right!=null){
                ans.add(temp.right.data);
            }
            
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
            return ans;
            
        }
        Collections.sort(ans);
        return ans;
       
    }
    
}
