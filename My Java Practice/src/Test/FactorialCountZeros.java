package Test;

public class FactorialCountZeros {
	
	static int FindingTrailingZeros(int n) {
		int ans=0;
		int p=5;
		
		while (n/p >0 ) {
			ans = ans + n/p;
			p=p*5;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.print("Trailing Zeros = " +FindingTrailingZeros(25));
	}

}
