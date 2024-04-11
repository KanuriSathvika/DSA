
class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        int bits=(int)(Math.log(n)/Math.log(2))+1;
        int ans=(n>>(bits-1))&1;
        int carry=ans;
        int finans=ans*(int)(Math.pow(2,bits-1));
        
        for(int i=1;i<bits;i++){
            carry=((n>>(bits-1-i))&1)^carry;
            
            finans=finans+carry*(int)Math.pow(2,bits-1-i);
        }
     
        
        return finans;
    }
       
}
