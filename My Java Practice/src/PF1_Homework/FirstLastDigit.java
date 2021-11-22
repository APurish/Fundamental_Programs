package PF1_Homework;
import java.lang.*;
import java.util.*;

public class FirstLastDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Test cases:");
	    int T = sc.nextInt();
	    int Last =0,first=0;
	    
	    for(int i=1;i<=T; i++) {
	    	System.out.print("Enter any num: ");
	    	 int num = sc.nextInt(); 	 
	    	 
	    	 Last = num%10;
	    	 while(num != 0) {
	    		 first = num%10;
	    		 num = num/10;
	    	  	 }
	    	 System.out.print("first & last digit:"+first +" " +Last);
	    	 System.out.println();
	    }
	    
	}
}
	    			    		
	    	