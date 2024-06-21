class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        if(n==0){
            return 0;
        }
        
        ArrayList<meeting> meet=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            meet.add(new meeting(start[i],end[i]));
        }
        
        meetcomaprator mc=new meetcomaprator();
        Collections.sort(meet,mc);
        
        
        
        int i=1,j=0;
        int count=1;
        
        while(i<n && j<n){
            if(meet.get(i).start>meet.get(j).end){
                count+=1;
                // System.out.println(meet.get(i).start+" "+meet.get(j).end+" "+i+" "+j);
                // System.out.println(count);
                j=i;
                i++;
                
                
            }
            else if(meet.get(i).start<=meet.get(j).end){
                i++;
            }
        }
        return count;
    }
}


class meeting{
    int start,end;
    public meeting(int s,int e){
        this.start=s;
        this.end=e;
    }
}

class meetcomaprator implements Comparator<meeting>{
    @Override
    public int compare(meeting m1, meeting m2){
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
