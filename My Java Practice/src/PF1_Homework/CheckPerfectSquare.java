package PF1_Homework;
import java.util.*;
import java.lang.*;

public class CheckPerfectSquare {
			
	  public double solve(double A) {
	        double sqrt = Math.sqrt(A);
	        double diff = sqrt - Math.floor(sqrt);
	        if(diff == 0){
	            return(1);
	        }
	        else {
	        	return(0);
	    }
	    }

	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter any num");
	        	double A = sc.nextDouble();
	        	CheckPerfectSquare ch = new CheckPerfectSquare();
	        	if(ch.solve(A) == 1) {
	        	System.out.print("It is perfect Square");
	        	}
	        	else {
	        	System.out.print("It is not ");
	    }
	        	
	    }
	    
}
