package Test;
import java.lang.*;
import java.util.*;


public class FactPermutCombination {
	
	static int Factorial(int n) {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter number =");
		//int fact = sc.nextInt();
		int ans =1;
		for(int i=1;i<=n;i++) {
		
		ans = ans*i;
		}
		return ans;
	}

	static int BinomialCoeff(int n, int r) {
		return Factorial(n)/(Factorial(n-r)*Factorial(r));
		
	}
	
	public static void main(String[] args) {
		System.out.println("Factorial=" +Factorial(25));
		System.out.println("Binomial Coeff=" +BinomialCoeff(6,3));
		
	}
	

}
