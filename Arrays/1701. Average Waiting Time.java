class Solution {
    public double averageWaitingTime(int[][] customers) {
        double prev=0,sum=0;
        for(int[] arr : customers){
            if(sum==0){
                prev=arr[0]+arr[1];
                sum=prev-arr[0];
                // System.out.println("0"+sum+" "+prev);
            }
            else{
                if(prev>=arr[0]){
                    prev=prev+arr[1];
                sum=sum+(prev-arr[0]);
                // System.out.println(sum+" "+prev);
                }
                else{
                    prev=arr[0]+arr[1];
                    sum=sum+(arr[1]);
                }
                
            }
        }
        double ans=(double)sum/customers.length;
        return ans;
    }
}
