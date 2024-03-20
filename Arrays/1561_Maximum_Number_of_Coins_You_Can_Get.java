class Solution {
    public int maxCoins(int[] piles) {
        int sum=0;
        Arrays.sort(piles);
        int n=piles.length;
        int i=0;
        while(i<n/3){
            sum=sum+piles[n-2-(2*i)];
            i++;
        }
        return sum;
    }
}
