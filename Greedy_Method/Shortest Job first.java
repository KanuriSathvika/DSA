class Solution {
    static int solve(int bt[] ) {
    // code here
    Arrays.sort(bt);
    int time=0;
    int process=0;
    for(int i=1;i<bt.length;i++){
        time+=(bt[i-1]);
        process+=time;
        // System.out.println(process);
    }
    int avg=(int)Math.floor(process/bt.length);
    return avg;
  }
}
