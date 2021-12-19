package PF1_Homework;
import java.lang.*;
import java.util.*;

public class DivBySomeNums {
	static int DivBy(int n) {
		
		if(n%5 == 0 && n%11 == 0){
	        return 1;
    }
    return 0;
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any num: ");
	    int n = sc.nextInt();
	    System.out.print(DivBy(n));
	    if (n <= 0) {
	    	System.out.print(0);
	    }
	    	
	    }	    
	}


