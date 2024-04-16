

class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        // code here
        
        int[] post_max=new int[n];
        int[] post_min=new int[n];
        
        post_max[n-1]=arr[n-1];
        post_min[n-1]=arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            post_max[i]=Math.max(arr[i],post_max[i+1]);
             post_min[i]=Math.min(arr[i],post_min[i+1]);
        }
        
        int ans=post_max[k]-post_min[k];
        int prev_max=arr[0];
        int prev_min=arr[0];
        
        for(int i=1;i<n-k;i++){
            ans=Math.min(ans, Math.max(prev_max,post_max[i+k])-Math.min(prev_min,post_min[i+k]));
            
            prev_min=Math.min(prev_min,arr[i]);
            prev_max=Math.max(prev_max,arr[i]);
        }
        
        ans=Math.min(ans,prev_max-prev_min);
        return ans;
    }
    
}
