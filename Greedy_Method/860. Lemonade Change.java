class Solution {
    public boolean lemonadeChange(int[] bills) {
        int change[]={0,0,0};
        int sum=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                change[0]=change[0]+1;
                sum=sum+5;
            }
            else if(bills[i]==10){
                if(change[0]>=1){
                    sum=sum-5+10;
                    change[0]-=1;
                    change[1]+=1;
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                if(change[1]>0 && change[0]>0){
                    sum=sum-15+20;
                    change[1]-=1;
                    change[0]-=1;
                    change[2]+=1;
                }
                else if(change[1]>=1 && change[0]<1){
                    return false;
                }
                else if(change[1]<1 && change[0]>=3){
                    // if(change[0]>=3){
                        sum=sum-15+20;
                        change[0]-=3;
                        change[2]+=1;
                    // }
                    
                }
                else{
                        return false;
                }
            }
        }
        return true;
    }
}
