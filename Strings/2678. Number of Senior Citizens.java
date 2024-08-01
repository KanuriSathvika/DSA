class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
            if((details[i].substring(11,13)).compareTo("60")>=1){
                c+=1;
            }
        }

        return c;
    }
}
