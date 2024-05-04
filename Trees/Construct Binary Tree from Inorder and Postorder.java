/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        return solve(in, post, 0, n - 1, 0, n - 1);
    }
     Node solve(int[] in, int[] post, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd) return null;
        if (inStart == inEnd) {
            return new Node(in[inStart]);
        }
        Node root = new Node(post[postEnd]);
        int ind = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == post[postEnd]) {
                ind = i;
                break;
            }
        }
        int left = ind - inStart;
        int right = inEnd - ind;

        root.left = solve(in, post, inStart, ind - 1, postStart, postStart + left - 1);
        root.right = solve(in, post, ind + 1, inEnd, postEnd - right, postEnd - 1);

        return root;
    }
}
