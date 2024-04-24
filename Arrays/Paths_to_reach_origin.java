

class Solution

{
    static int mod=1000000007;
    public static int ways(int n, int m)
    {
        // complete the function
       int[][] dp=new int[n+1][m+1];
       for(int[] i:dp){
           Arrays.fill(i,-1);
       }
       
       return solve(n,m,dp);
    }
    
    public static int solve(int n, int m, int[][] dp)
    {
        // complete the function
        if(n==0 && m==0){
            return 1;
        }
        if(dp[n][m]!=-1) return dp[n][m];
        int left=0,right=0;
        if(n>0){
            left=solve(n-1,m,dp) % mod;
        }
        if(m>0){
            right=solve(n,m-1,dp) % mod;
        }
        dp[n][m]=(left+right) % mod;
        return (left+right) % mod;
    }
}
