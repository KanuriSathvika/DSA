class Solution {
    public int romanToInt(String s) {
        int val=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            // if(i==0){
                if(ch=='I'){
                    val=val+1;
                }
                else if(ch=='V') {
                    val=val+5;
                }
                else if(ch=='X') {
                    val=val+10;
                }else if(ch=='L') {
                    val=val+50;
                }else if(ch=='C') {
                    val=val+100;
                }else if(ch=='D') {
                    val=val+500;
                }else if(ch=='M') {
                    val=val+1000;
                }
            // }

            if(i!=0 && ch=='V' && s.charAt(i-1)=='I'){
                val=val-5+(5-2);
            }
            else if(i!=0 && ch=='X' && s.charAt(i-1)=='I'){
                val=val-10+(10-2);
            }
            else if(i!=0 && ch=='L' && s.charAt(i-1)=='X'){
                val=val-50+(50-20);
            }
            else if(i!=0 && ch=='C' && s.charAt(i-1)=='X'){
                val=val-100+(100-20);
            }
            else if(i!=0 && ch=='D' && s.charAt(i-1)=='C'){
                val=val-500+(500-200);
            }
            else if(i!=0 && ch=='M' && s.charAt(i-1)=='C'){
               
                val=val-1000+(1000-200);
                
            }
        }

        return val;
    }
}
