class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
            }
            else{
                count.put(nums[i],count.get(nums[i])+1);
            }

            if(count.get(nums[i])>(nums.length)/3){
                
                if(!ans.contains(nums[i])){
                    ans.add(nums[i]);
                }
            }
        }
        return ans;
    }
}
