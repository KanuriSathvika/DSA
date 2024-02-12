import java.util.Hashtable;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> ht=new  HashMap<Integer,Integer>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(!ht.containsKey(nums[i])){
                ht.put(nums[i],1);
            }
            else if(ht.containsKey(nums[i])){
                ht.replace(nums[i],ht.get(nums[i])+1);
            }
        }
        int max=0;
        int ans=0;
       
       for(Integer i:ht.keySet()){
           if(max<ht.get(i)){

               max=ht.get(i);
               ans=i;
           }
       }

        return ans;
    }
}
