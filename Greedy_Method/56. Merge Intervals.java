class Solution {
    public int[][] merge(int[][] intervals) {
        
        ArrayList<meeting> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            list.add(new meeting(intervals[i][0],intervals[i][1]));
        }
        meetCompare mc=new meetCompare();
        Collections.sort(list,mc);
        
        int i=1,j=0,maxi=0;
        while(i<list.size() && j<list.size()){
            
            if(list.get(i).start<=list.get(j).end){
                maxi=Math.max(list.get(j).end,list.get(i).end);
                list.get(j).end=maxi;
                list.remove(j+1);
            }
            else{
                i++;
                j++;
            }
            
        }

        int[][] ans=new int[list.size()][2];
        for(int x=0;x<list.size();x++){
            ans[x][0]=list.get(x).start;
            ans[x][1]=list.get(x).end;
        }

        return ans;
    }
}
class meeting{
    int start, end;
    public meeting(int s, int e){
        this.start=s;
        this.end=e;
    }
}
class meetCompare implements Comparator<meeting>{
    public int compare(meeting m1,meeting m2){
        if(m1.start>m2.start){
            return 1;
        }
        else if(m1.start<m2.start){
            return -1;
        }
        return 0;
    }
}
