class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,maxi=0,zc=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zc=zc+1;
            }
            if(zc>k){
                while(zc>k){
                    if(nums[l]==0){
                        zc--;
                    }
                    l++;
                }
            }
            maxi=Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}
