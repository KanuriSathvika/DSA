/*Complete the function below
Node is as follows:
class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null
}
}
*/
class Solution{
    
    //  Map<Integer, Integer> mp = new HashMap<>();
      ArrayList <Integer> al;

    // void preorder(Node node, int level) {
    //     if (node != null) {
    //         mp.put(level, mp.getOrDefault(level, 0) + node.data);

    //         preorder(node.left, level - 1);
    //         preorder(node.right, level + 1);
    //     }
    // }
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
         al = new  ArrayList <Integer>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        vSum(root, 0, map);
        
        for (int value : map.values()) {
            al.add(value);
        }
        return al;
    }
    
    void vSum(Node root, int hd, TreeMap<Integer, Integer> map){
        if(root==null) return;
        
        vSum(root.left, hd-1, map);
        
        // int pSum = (map.get(hd)==null) ? 0 : map.get(hd);
        // map.put(hd, pSum+root.data);
        
        map.put(hd, map.getOrDefault(hd,0)+root.data);
        
        vSum(root.right, hd+1, map);
    }
}
