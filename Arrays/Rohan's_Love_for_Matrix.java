
// User function Template for Java
class Solution {
    static int firstElement(int n) {
        // code here
        int mod=1000000007;
        int a00=1;
        int a10=1;
        int temp=0;
        for(int i=2;i<=n;i++){
            temp=a10%mod;
            a10=a00%mod;
            a00=(a00+temp)%mod;
            // System.out.println(a10);
        }
        // System.out.println(a10);
        return a10  ;
    }
}
