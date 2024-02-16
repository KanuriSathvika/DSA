class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> count=new HashMap<>();
    
        for (int i=0;i<arr.length;i++){
            if(count.containsKey(arr[i])){
                count.replace(arr[i],count.get(arr[i])+1);
            }
            else{
                count.put(arr[i],1);
            }
            
        }

        if(k==0){
            return  count.size();
        }
        
        ArrayList<Integer> freq=new ArrayList<>();
        for(Integer key: count.keySet()){
            freq.add(count.get(key));
           
        }

        Collections.sort(freq);
        
        int ind=0,sum=0;
        
        while(k>sum && ind<freq.size()){
            sum=sum+freq.get(ind);
            
            if(k-sum==0){
                return freq.size()-ind-1;
            }
            if(k-sum<0){
                sum=sum-(sum-k);
                freq.set(ind,k-freq.get(ind));
            }
             if(k-sum==0 ){
                return  freq.size()-ind;
            }
            ind++;
        }
        return -1;
    }
}
