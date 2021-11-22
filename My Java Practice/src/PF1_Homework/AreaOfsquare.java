package PF1_Homework;
import java.lang.*;
import java.util.*;


public class AreaOfsquare {
	    public static int solve(int A) {

	        int area=0;
	        area = A*A;

	        return(area);
	        	    
	    }
	    static int factorial(int n) {
	    	int ans =1;
	    	for(int i=1; i<=n;i++) {
	    		ans = ans*i;
	    	}
	    	return ans;
	    }
	    static int binomialCoeff(int n,int r) {
	    	int num= factorial(n);
	    	int t1= factorial(n-r);
	    	int t2 = factorial(r);
	    	int denom = t1*t2;
	    	
	    	int ans = num/denom;
	    	 return ans;
	    	
	    }
	    static void pascalTriangle(int n) {
	    	for (int i=0; i<n; i++) {
	    		for (int j=0;j<=i; j++) {
	    			System.out.print(binomialCoeff(i,j)+" ");
	    		}
	    		System.out.println();
	    	}
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter num : ");
	        int A = sc.nextInt();
	        //Solution s = new Solution;
	        System.out.println(solve(A));
	        pascalTriangle(5);

	    }
	}



