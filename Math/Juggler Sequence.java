// User function Template for Java

class Solution {
    static List<Integer> jugglerSequence(int n) {
        // code here
        List<Integer> list=new ArrayList<>();
        list.add(n);
        while(n!=1){
            if(n%2==0){
                n=(int)(Math.sqrt(n));
                list.add(n);
            }
            else{
                n=(int)(Math.sqrt(Math.pow(n,3)));
                list.add(n);
            }
            // list.add(n);
            
        }
        //  recur(n,list);
        return list;
        
    }
    
}
