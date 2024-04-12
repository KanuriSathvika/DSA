
class Solution {
    static long pairAndSum(int n, long arr[]) {
        // code here
        long sum=0;
        
        
        
        for(int i=0;i<32;i++){
            long count=0;
            for(int j=0;j<n;j++){
                if(((arr[j]) & (1<<i))>0){
                    count++;
                    // System.out.println(count);
                }
            }
            
            sum+=(1<<i)*(count*(count-1)/2);
            // System.out.println(count);
        }
        return sum;
    }
}
