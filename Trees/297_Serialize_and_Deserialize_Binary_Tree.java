/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
     String str;
    public String serialize(TreeNode root) {
        if(root==null){
            str+="null ";
            return str;
        }
        str+=String.valueOf(root.val)+" ";
        serialize(root.left);
        serialize(root.right);

        if(str.length()>3){
            if(str.charAt(0)=='n'){
                str=str.substring(4,str.length());
            }
        }
        return str;
    }
    
    // Decodes your encoded data to tree.
    Queue<String> q=new LinkedList<>();
    public TreeNode deserialize(String data) {
        q.addAll(Arrays.asList(data.split(" ")));
        return help();
    }
    
    public TreeNode help(){
        String val=q.remove();
        if(val.charAt(0)=='n' ){
            return null;
        }
        TreeNode n=new TreeNode(Integer.parseInt(val));
        n.left=help();
        n.right=help();
        return n;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
