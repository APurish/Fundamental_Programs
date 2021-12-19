package Test;

import java.lang.*;
import java.util.*;

public class PatterPyramidNum {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter num: ");
    int N = sc.nextInt();   
   // int R = N;
    for(int row=1;row<=N;row++) {
    	for(int j=1;j<=N-row+1;j++)
    	//for(int j=1;j<=N;j++)
    	{
    	System.out.print(j);
    	if(j!=N-row+1) {
    		System.out.print(" ");
    	}
    	}
    	System.out.println();
    	//N=N-1;
    }
	}
}

       	
   
    
	
