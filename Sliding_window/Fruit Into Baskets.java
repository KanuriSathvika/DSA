class Solution {
    public static int totalFruits(Integer[] arr) {
        // code here
        if(arr.length==1){
            return 1;
        }
        
        int b1=arr[0],b2=0,bcount1=1,bcount2=0,maxi=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==b1){
                bcount1+=1;
                
            }
            else if (b2==0){
                b2=arr[i];
                bcount2=1;
            }
            else if(b2==arr[i]){
                bcount2+=1;
            }
            else{
                b1=b2;
                b2=arr[i];
                bcount1=bcount2;
                bcount2=1;
            }
            maxi=Math.max(maxi,bcount1+bcount2);
        }
        return maxi;
    }
}
