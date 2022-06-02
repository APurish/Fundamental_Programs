package StringsProblems;
import java.lang.*;
import java.util.*;

public class StringPalindrome {	
	public static int Palindrone(String s) {
		int start=0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
              return 0;             
            }
            start++;
            end--;
	}
        return 1;
	}
	
	
	    public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter n times:");
	      int n = sc.nextInt();   
	      for(int i=1;i<=n;i++){
	    	String s = sc.nextLine();	    	
	    	}	      
	      }      
	    }
	

