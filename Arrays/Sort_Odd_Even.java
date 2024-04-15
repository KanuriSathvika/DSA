import java.util.* ;
import java.io.*; 
public class Solution {
	public static void sortOddEven(int[] nums) {
		// Write your code here.
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();

		for(int i:nums){
			if(i%2==0){
				even.add(i);
			}
			else{
				odd.add(i);
			}
		}

		Collections.sort(even);
		Collections.sort(odd,Collections.reverseOrder());
		// System.out.println(even + " "+odd);
		int j=0,k=0;
		for(int i=0;i<nums.length;i++){
			if(k<odd.size()){
				nums[i]=odd.get(k);
				k++;
			}
			else if(k>=odd.size() && j<even.size()){
				nums[i]=even.get(j);
				j++;
			}
			
		}

		
	}
}
