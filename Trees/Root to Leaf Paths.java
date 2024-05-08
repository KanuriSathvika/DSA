/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        solve(root, list,ans);
        return ans;
    }
    public static void solve(Node node, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        if(node==null){
            return ;
        }
        
       
        if(node.left==null && node.right==null){
            list.add(node.data);
             ArrayList<Integer> temp2 = new ArrayList<>();
             temp2.addAll(list);
             ans.add(temp2);
             list.remove(list.size()-1);
            //  return;
            // ans.add(list);
            return ;
        }
         list.add(node.data);
        solve(node.left,list,ans);
        solve(node.right,list,ans);
         list.remove(list.size()-1);
        return;
    }
}
