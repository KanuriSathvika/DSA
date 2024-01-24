class Solution {
    public int numberOfBeams(String[] bank) {
        int sum=0, c=0;

        for(int i=0;i<bank.length;i++){
            int x=0;
            for (int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    x=x+1;
                }
            }
            
            if( x!=0){
                sum=sum+(c*x);
                c=x;
            
            }
        }
         return sum;
    }
}
