class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,maxi=0;
        
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        for(int r=1;r<s.length();r++){

            if((s.substring(l,r)).contains(s.substring(r,r+1))){
               
                while((s.substring(l,r)).contains(s.substring(r,r+1))){
                    l++;
                }
            }
           
            maxi=Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}
