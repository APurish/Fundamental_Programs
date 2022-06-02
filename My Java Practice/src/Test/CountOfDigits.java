package Test;
import java.lang.*;
import java.util.*;

public class CountOfDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter T times: ");
	    int T = sc.nextInt();
	    
	    for(int i=1;i<=T;i++){
	    	int ans=0;
	    	System.out.print("Enter Num: ");
	        int N = sc.nextInt();
	        //System.out.println();
	        while(N != 0 ) {
	            int lastDig = N%10; 
	            ans++;
	            N = N/10;
	            
	        }
	        if(ans == 0) {
	            ans=1;
	            }
	        System.out.print(ans);
	        System.out.println();
	        
	    }
		}
}
