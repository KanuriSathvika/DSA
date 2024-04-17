import java.util.* ;
import java.io.*; 
public class Solution
{
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.

        int carry=1;
        for(int i=arr.size()-1;i>=0;i--){
            int sum=arr.get(i)+carry;
            if(sum>9){
                carry=1;
                arr.set(i,sum%10);
            }
            else{
                arr.set(i,sum);
                carry=0;
            }

        }

        if(carry>0){
            arr.add(0,carry);
        }
       
       while(arr.size()>1){
           if(arr.size()>=2 && arr.get(0)==0 && arr.get(1)>=0){
               arr.remove(0);
            //    System.out.println(arr);
           }
           else{
               break;
           }
        //    x++;
       }
        return arr;
    }
}
