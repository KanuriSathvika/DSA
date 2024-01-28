class Solution {
    public int titleToNumber(String title) {
        int sum=0;
        int n=title.length();
        for(int i=0;i<n;i++){
            sum=sum+(int)Math.pow(26,n-1-i)*(title.charAt(i)-'A'+1);
        }
        return sum;
    }
}
