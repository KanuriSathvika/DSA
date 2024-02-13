class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int c=0;
            for(int j=0;j<words[i].length();j++){
            if(words[i].charAt(j)!=words[i].charAt(words[i].length()-1-j)){
             c=c+1;
                break;
            }
            }
            if(c==0){
                return words[i];
            }
            
        }
        return "";
    }
}
