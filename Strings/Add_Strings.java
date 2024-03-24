import java.util.* ;
import java.io.*; 

public class Solution {

	public static String stringConcatenation(String num1, String num2) {
		// Write your code here.

		int n1=num1.length()-1;
		int n2=num2.length()-1;
		String ans="";
		int carry=0;
		while(n1>=0 || n2>=0){
			if(n1<0){
				ans=(num2.charAt(n2)-48+carry)%10+ans;
				carry=( num2.charAt(n2)-48+carry)/10;
				n2--;
			}
			else if(n2<0){
				ans=(num1.charAt(n1)-48+carry)%10 +ans;
				carry=( num1.charAt(n1)-48+carry)/10;
				n1--;
			}
			else{
				ans=(((num1.charAt(n1)-48)+(num2.charAt(n2)-48)+carry)%10)  +  ans;
				carry=((num1.charAt(n1)-48)+(num2.charAt(n2)-48)+carry)/10;
				n1--;
				n2--;
			}
		}
		if(carry>0){
			ans=carry+ans;
		}
		return ans;
	}

}
