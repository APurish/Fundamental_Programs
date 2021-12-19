package Test;
import java.lang.*;
import java.util.*;


public class BankAccount {
//	   static int Add(int A){
//	        int sum=0;
//	        sum=N+A;
//	        return sum;
//	    }
//	    static int sub(int A){
//	        int s=0;
//	        s= N-A;
//	        return s;
//	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Amount: ");
	        int N = sc.nextInt();
	        System.out.print("Enter No. of Transtions: ");
	        int m = sc.nextInt();
	        int s1=0,s2=0;
	        int TotalAmnt=N;
	        for(int i=1;i<=m;i++){
	        System.out.print("Enter tran type:"+" ");
	        int t = sc.nextInt();
	        //System.out.print("Enter Transac Amount:");
	        int A = sc.nextInt();
	        if(t == 1){
	         s1 = N+A;
	         TotalAmnt=s1;
	            System.out.println(s1);
	        }
	        else if(t == 2) {
	         s2 =TotalAmnt-A;
	         TotalAmnt=s2;
	        	System.out.println(s2);
	        }
	        if(A > TotalAmnt) {
	        	System.out.print("Insufficient Funds");
	        	break;
	        }
	        }
	    }
}

	    
