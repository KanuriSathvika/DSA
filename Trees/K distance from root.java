/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
        //   public List<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int level = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
      
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node node = q.poll();
                if (level == k) ans.add(node.data);
              
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            level++;
        }
        return ans;
     }
}
