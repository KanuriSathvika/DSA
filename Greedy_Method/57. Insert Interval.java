class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<inters> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            list.add(new inters(intervals[i][0],intervals[i][1]));

        }
        list.add(new inters(newInterval[0],newInterval[1]));
        interCompare com=new interCompare();
        Collections.sort(list,com);

        int i=1,j=0,c=0;

        while(i<list.size() && j<list.size()){
            if(list.get(j).end<list.get(i).start){
                i++;j++;
            }
            else{
                list.get(j).end=Math.max(list.get(j).end,list.get(i).end);
                list.remove(i);
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
class inters{
    int start,end;
    public inters(int s,int e){
        this.start=s;
        this.end=e;
    }
}
class interCompare implements Comparator<inters>{
    public int compare(inters m1, inters m2){
        if(m1.start>m2.start){
            return 1;
        }
        else if(m1.start<m2.start){
            return -1;
        }
        return 0;
    }
}
