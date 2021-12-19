package Test;
import java.lang.*;
import java.util.*;

public class BankAccFunction {
	 public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Amount: ");
    	int N = sc.nextInt();
    	System.out.print("Enter No. of Transtions: ");
        int m = sc.nextInt();
       
        for(int i=1;i<=m;i++)
        {
        System.out.print("Enter tran type:"+" ");
    	int t = sc.nextInt();    	
    	int A = sc.nextInt();
    	if(N < A) {
        	System.out.print("Insufficient Funds");
        	break;
        	}
    	if(t == 1) { 
    		N = N+A;
    		System.out.println(N);
    	}
    	if(t == 2){
    		N = N-A;
    		System.out.println(N);
    		}
    	}
        }
}

	 