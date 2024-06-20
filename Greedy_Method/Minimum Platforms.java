class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        if(n==0){
            return 0;
        }
        
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat=1;
        
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat++;

                i++;
            }
            else if(arr[i]>dep[j]) {
                i++;
                j++;
            }
        }
         return plat;
        
    }
    
}
