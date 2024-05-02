/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/

class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    //  ArrayList<Integer> str= new ArrayList<>();
    public ArrayList<Integer> serialize(Node root) {
        // code here
          ArrayList<Integer> ans = new ArrayList<>();
        preOrder(root, ans);
        return ans;
    }

    // Function to deserialize a list and construct the tree.
    
    // Queue<Integer> q=new LinkedList<>();
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        int[] ind = new int[]{0};
        return solve(A, ind);
    }
    private Node solve(ArrayList<Integer> A, int[] ind) {
        if (A.get(ind[0]) == -1) {
            ind[0]++;
            return null;
        }
        Node root = new Node(A.get(ind[0]));
        ind[0]++;
        root.left = solve(A, ind);
        root.right = solve(A, ind);
        return root;
    }
    
    private void preOrder(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            ans.add(-1);
            return;
        }
        ans.add(root.data);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
};
