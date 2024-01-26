class Solution {
    public int climbStairs(int n) {
    //     if(n==1){
    //         return 1;
    //     }
    //     if(n==2){
    //         return 2;
    //     }
    //    return climbStairs(n-1)+climbStairs(n-2);

    double val=(Math.pow((1+Math.sqrt(5))/2,n+1)-Math.pow((1-Math.sqrt(5))/2,n+1));
    double ans=val/Math.sqrt(5);

    return (int)ans;
    }
}
