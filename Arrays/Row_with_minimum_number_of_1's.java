// User function Template for Java

class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1){
                    sum+=1;
                }
            }
            
            if(sum<min){
                min=sum;
                ans=i;
            }
        }
        
        return ans+1;
    }
}
