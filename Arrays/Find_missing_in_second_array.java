
class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        // ArrayList<Integer> list =new ArrayList<>();
        HashSet<Integer> list=new HashSet<>();
        for(int i:b){
            list.add(i);
        }
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!list.contains(a[i])){
                ans.add(a[i]);
            }
        }
        
        return ans;
    }
}
