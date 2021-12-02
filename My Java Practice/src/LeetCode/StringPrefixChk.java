package LeetCode;
//import java.lang.*;
//import java.util.*;


public class StringPrefixChk {
	
	public String longestCommonPrefix(String[] strs) {
			
        if (strs.length == 0) return "";
        String prefix = strs[0];
        
        for(int i=0; i<strs.length;i++) 
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length() -1);
                if(prefix.isEmpty()) return "";
            }
            return prefix;
        
	}
            

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter no. of strings: ");
//		String N = sc.next();
//		int arr[] = new int[N];  // Creating an Array of size N
//		for(int j= 0; j<=arr.length;j++) {
//			arr[j] = sc.nextInt();  
//		}
		String [] strs = {"","Shubham"};
		StringPrefixChk c = new StringPrefixChk();
		String str = c.longestCommonPrefix(strs);
		System.out.println("The Prefix is :"+str);
		
	}
}
        
            
   