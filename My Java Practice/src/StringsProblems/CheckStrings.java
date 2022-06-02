package StringsProblems;
// You are given a string A.
// Find the number of indices where the reverse of the given string and the original string are different. 
import java.util.*;


public class CheckStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
	    String s = sc.nextLine();
	    char[] ch = new char[s.length()];
	    int cnt=0;
	    int j=s.length()-1;
	    int i=0;
	    while(i<=j) {
	    	ch[i]=s.charAt(i);
	    	if(ch[i] != ch[j]) {
	    	cnt = cnt + 2;
	    	}
	    	else {
	    		System.out.print(0);
	    		return;
	    	
	    	}
	    	i++;
    		j--;
    	}
	    //System.out.print("Not palindrome");
	    System.out.println(cnt);
	    
    }
}
