
// User function Template for Java

class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here
        int i=0,j=0,previ=0,prevj=0, x=0;
        while(i<n && i>=0 && j<m && j>=0){
            previ=i;
            prevj=j;
            if(matrix[i][j]==1){
                matrix[i][j]=0;
                if(x==0){
                    i++;
                    x=1;
                }
                else if(x==1){
                    j--;
                    x=2;
                }
                else if(x==2){
                    i--;
                    x=3;
                }
                else{
                    j++;
                    x=0;
                }
            }
            else{
                if(x==0){
                    j++;
                    // x=1;
                }
                else if(x==1){
                    i++;
                    // x=2;
                }
                else if(x==2){
                    j--;
                    // x=3;
                }
                else{
                    i--;
                    // x=0;
                }
            }
            
        }
        int[]  ans={previ,prevj};
        return ans;
    }
}
