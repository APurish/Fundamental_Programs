package PF1_Homework;
import java.util.*;
import java.lang.*;

public class PositionInQueue {
	public static int solve(int A) {
        int ans =1;
        while (ans*2 <=A){
            ans =ans*2;
        }
        return ans;
	}
	
//	public static void main (String[] args){
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter any Integer: ");
//	int A = sc.nextInt();
//	System.out.print(solve(A));
//	
//	
//	}
}
	
	

