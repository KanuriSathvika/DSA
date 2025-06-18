public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        int c=1;
        int m=n*2;
        for(int i=0;i<n;i++){
            int x= m-(i+1)*2;
            int k=i+1+1;

            for(int j=0;j<m;j++){
                if(i>=j){
                    System.out.print(c+j+" ");
                }
                else if(i<j && x>0){
                    System.out.print("  ");
                    x--;
                }
                else{
                    System.out.print(k-1+" ");
                    k--;
                }
            }
            System.out.println();
        }
    }
}
