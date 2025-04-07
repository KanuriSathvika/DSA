class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;
        int temp=nums[0];
        int ans=0,i=1;
        while(i<nums.length-ans){
            if(temp!=nums[i]){
                temp=nums[i];
                c=1;
                i++;
            }
            else if(temp==nums[i] && c<2){
                c++;
                // System.out.println(c);
                i++;
            }
            else if(temp==nums[i] && c==2){
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                // System.out.println(c+" "+i);
                // System.out.println(Arrays.toString(nums));
                ans++;
            }
        }

        return nums.length-ans;
    }
}
