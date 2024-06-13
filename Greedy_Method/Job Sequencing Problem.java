class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)-> (b.profit-a.profit));
        
        int jobs=0;
        int total_profit=0;
        int maxi=0;
        
        for(int i=0;i<n;i++){
            if(arr[i].deadline>maxi){
                maxi=arr[i].deadline;
            }
        }
        
        int slot[]=new int[maxi+1];
        for(int i=1;i<=maxi;i++){
            slot[i]=-1;
        }
        
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(slot[j]==-1){
                    slot[j]=i;
                    jobs+=1;
                    total_profit+= arr[i].profit;
                    break;
                }
            }
            
        }
        
        int[] ans=new int[2];
        ans[0]=jobs;
        ans[1]=total_profit;
        
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
