// User function Template for Java

class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        // code here
        if(n<3 || m<3){
            return -1;
        }
        
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                sum=mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2];
                
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}
