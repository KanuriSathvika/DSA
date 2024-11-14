class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0;
        int maxi=0;

        for(int i=0;i<=k-1;i++){
            lsum=lsum+cardPoints[i];
        }
        maxi=lsum;
        int rind=cardPoints.length-1;
        for (int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rind];
            rind--;
            maxi=Math.max(maxi,lsum+rsum);
        }
        return maxi;
    }
}
