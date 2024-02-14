class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];

        int pos_index=0,neg_index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[pos_index]=nums[i];
                pos_index++;
            }
            else{
                neg[neg_index]=nums[i];
                neg_index++;
            }
        }

        int cp=0,cn=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos[cp];
                cp++;
            }
            else{
                nums[i]=neg[cn];
                cn++;
            }
        }

        return nums;
    }
}
