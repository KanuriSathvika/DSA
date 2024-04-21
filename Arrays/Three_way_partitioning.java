//User function Template for Java

class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int start=0,end=array.length-1;
        
        for(int i=0;i<=end;i=i){
            if(array[i]<a){
                int temp=array[i];
                array[i]=array[start];
                array[start]=temp;
                
                i++;
                start++;
                
            }
            else if(array[i]>b){
                 int temp=array[i];
                array[i]=array[end];
                array[end]=temp;
                end--;
            }
            else{
                i++;
            }
        }
    }
}
