class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len=0;
        String ans="";
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            if(len%2==0){
                ans=ans+word1.charAt(i);
                i++;
            }
            else{
                ans+=word2.charAt(j);
                j++;
            }
            len++;
        }
        if(i<word1.length()){
            ans+=word1.substring(i);
        }
        else if(j<word2.length()){
            ans+=word2.substring(j);
        }

        return ans;
    }
}
