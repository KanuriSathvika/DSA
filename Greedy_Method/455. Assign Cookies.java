class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int c=0,x=0;
        for(int i=0;i<g.length;i++){
            for(int j=x;j<s.length;j++){
                // System.out.println(i+" "+j);
                if(s[j]>=g[i]){
                    c=c+1;
                    // System.out.println(x);
                    x++;
                    break;
                }
                
                else{
                    x++;
                    // System.out.println(x);
                }

                
            }
            if(x==s.length){
                return c;
            }
        }
        return c;
    }
}
