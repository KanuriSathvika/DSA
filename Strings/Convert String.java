import java.util.* ;
import java.io.*; 
public class Solution{
	public static String convertString(String str) {
            // Write your code here

            String[] words= str.split(" ");
            String ans="";
            for(String s: words){
                if(ans.isEmpty()){
                    ans=Character.toUpperCase(s.charAt(0))+s.substring(1);
                }
                else{
                    ans=ans+" "+Character.toUpperCase(s.charAt(0))+s.substring(1);
                }
                
            }

            return ans;
        }

}
