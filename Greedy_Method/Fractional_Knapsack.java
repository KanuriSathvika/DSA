/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class comparator implements Comparator<Item>{
    @Override
    public int compare(Item a, Item b){
        double r1=(double)a.value/(double)a.weight;
        double r2= (double)b.value/(double)b.weight;
        
        if(r1>r2){
            return -1;
        }
        else if(r1<r2){
            return 1;
        }
        return 0;
    }
}


class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        
        Arrays.sort(arr, new comparator());
        
        int curweight=0;
        double finalval=0;
        
        for(int i=0;i<n;i++){
            if(curweight+arr[i].weight<=W){
                curweight+=arr[i].weight;
                finalval+=arr[i].value;
            }
            else{
                int remain=W-curweight;
                
                finalval+= ((double)arr[i].value/(double)arr[i].weight)*(double)remain;
                break;
            }
        }
        
        
        
        return finalval;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
