class Solution {
    public boolean check(int[] nums) {
        int c=0,peak=0,peakInd=nums.length-1;
        for(int i=0;i<nums.length;i++){
                if(i<nums.length-1 && nums[i]>nums[i+1]){
                    peak=nums[i];
                    peakInd=i;
                }

        }

        int x=nums.length-1-peakInd;
        while(x>0){
            int temp=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
            x--;
        }

        
        for(int ind=0;ind<nums.length-1;ind++){
            if(nums[ind]>nums[ind+1]){
                return false;
            }
        }

        return true;
    }
}
