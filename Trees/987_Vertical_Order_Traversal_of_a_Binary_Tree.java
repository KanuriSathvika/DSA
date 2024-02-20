import java.lang.Object;
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(root==null){
            return list;
        }
        int col=0,min=0,max=0;
        TreeNode node=root;
        Map<Integer,ArrayList<Integer>> map =new HashMap();

        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> l=new ArrayList<>();
        l.add(col);
        q.add(node);
        int count=1;  //to know level by level values are completed

        // To keep track of columns that repeats in same level
        HashMap<Integer,Integer> freq=new HashMap(); 

        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            count=count-1;

            col=l.remove(0);
            node=temp;

            if(node!=null){
                if(!map.containsKey(col)){
                    map.put(col, new ArrayList<>());
                }
                Integer n=Integer.valueOf(node.val);

                if(!freq.containsKey(col)){
                     map.get(col).add(n);

                     freq.put(col,0);
                   
                }

                else if(freq.containsKey(col)){
                    freq.replace(col,freq.get(col)+1);
                    if(map.get(col).size()>=1){
                        map.get(col).add(n);

                        // To sort the elements which are at same column in same level
                        Collections.sort((map.get(col)).subList((map.get(col)).size()-freq.get(col)-1, (map.get(col)).size()));

                    }
                    
                }
                

                     
            }

            min=Math.min(min,col);
            max=Math.max(max,col);

            if(node.left!=null){
                q.add(node.left);
                l.add(col-1);
            }
            if(node.right!=null){
                q.add(node.right);
                l.add(col+1);
            }
            if(count==0){
                count=q.size();
                freq.clear();   // To delete all the cols with freqs of same level when level is complete
            }


        }

        for(int i=min;i<=max;i++){
            list.add(map.get(i));
        }

        return list;
    }
}
