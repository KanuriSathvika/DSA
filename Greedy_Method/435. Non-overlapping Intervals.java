class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        comparing com=new comparing();

        ArrayList<inters> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            list.add(new inters(intervals[i][0],intervals[i][1]));
        }
        Collections.sort(list,com);
        int non=0,len=list.size();
        int i=1,j=0;
        
        while(i<len && j<len){
            if(list.get(i).start>=list.get(j).end){
                j=i;
                i++;
                non+=1;
            }
            else{
                i++;
            }
        }
        return len-1-non;
    }
}
class inters{
    int start,end;
    public inters(int s,int e){
        this.start=s;
        this.end=e;
    
    }
}
class comparing implements Comparator<inters>{
    public int compare(inters m1,inters m2){
        if(m1.end<m2.end){
            return -1;
        }
        else if(m1.end>m2.end){
            return 1;
        }
        else{
            return 0;
        }
    }
}
