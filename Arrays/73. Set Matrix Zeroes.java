class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    list.add(temp);
                }
            }
        }
        for(int x=0;x<list.size();x++){
            for(int i=0;i<matrix[0].length;i++){
                matrix[list.get(x).get(0)][i]=0;
            }
             for(int j=0;j<matrix.length;j++){
                matrix[j][list.get(x).get(1)]=0;
            }
        }
    }
}
