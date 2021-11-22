package Test;
import java.lang.*;
import java.util.*;

public class HCF {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter No of Test case: ");
	      int T = sc.nextInt();   
	      for(int i=1;i<=T;i++)
	        {
	    	  //System.out.print("Enter first no: ");	
	    	  int a = sc.nextInt();
	    	  //System.out.print("Enter second no: ");
	       	  int b = sc.nextInt();
	       	  
	       		int HCF =0;//int j=1;
	       		for(int j=1;j<Math.max(a,b); j++) {
	       		//while(j <= Math.max(a,b))		       		
	            if(a%j ==0 && b%j == 0){
	            	HCF = j;
	             }	            
	            
	         }
	       		System.out.print(HCF);
	       		System.out.println();
	       	}
	      
	      }
	}
