// User function Template for Java
class Solution {
    public void printArr(int n, int arr[]) {
        // code here
        for (int i=0;i<n;i++){
            if(i==n-1){
                System.out.print(arr[i]);
                System.out.println();
            }
            else{
                System.out.print(arr[i]+" ");
            }
            
        }
    }

    public void setToZero(int n, int arr[]) {
        // code here
        
        Arrays.fill(arr,0);
    }

    public void xor1ToN(int n, int arr[]) {
        // code here
        for(int i=0;i<n;i++){
            arr[i]=i^arr[i];
        }
    }
}
