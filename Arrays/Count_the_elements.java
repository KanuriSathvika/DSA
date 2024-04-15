class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int[] ans=new int[q];
        int ind=0;
        for(int i: query){
           int num=a[i];
           int c=0;
           for(int j=0;j<b.length;j++){
               if(num>=b[j]){
                   c++;
               }
           }
           ans[ind]=c;
           ind++;
            
        }
        
        return ans;
    }
   
}
