class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> count=new HashMap<>();
        
        for(int i=0;i<arr1.length;i++){
            if(count.containsKey(arr1[i])){
                count.put(arr1[i],count.get(arr1[i])+1);
            }
            else{
                 count.put(arr1[i],1);
            }
           
        }
        
        int index=0;
        for(int i=0;i<arr2.length;i++){
            if(count.containsKey(arr2[i]) && count.get(arr2[i])>0){
                while(count.get(arr2[i])>0){
                    arr1[index]=arr2[i];
                    index++;
                    count.put(arr2[i],count.get(arr2[i])-1);
                }
                count.remove(arr2[i]);
            }
        }

        ArrayList<Integer> list= new ArrayList<>();

        for(Integer i: count.keySet()){
            list.add(i);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            while(count.get(list.get(i))>0){
                    arr1[index]=list.get(i);
                    index++;
                    count.put(list.get(i),count.get(list.get(i))-1);
                }
        }
      
       return arr1;
    }
}
