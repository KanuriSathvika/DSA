class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            }
            // System.out.println(Arrays.toString(matrix[i]));
            for(int x=0;x<n/2;x++){
                int temp=matrix[i][x];
                matrix[i][x]=matrix[i][n-1-x];
                matrix[i][n-1-x]=temp;
            }
        }
    }
}
