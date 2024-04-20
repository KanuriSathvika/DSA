
//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        
        HashSet<Integer> set=new HashSet<>();
        
        int i=0, j=0;
        while(i<n || j<m){
            if(i<n){
                set.add(arr1[i]);
                i++;
            }
            else if(j<m){
                set.add(arr2[j]);
                j++;
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int x:set){
            ans.add(x);
        }
        
        Collections.sort(ans);
        
        return ans;
        
    }
}
