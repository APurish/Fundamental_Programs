package PF1_Homework;

public class TrailingZeros {
	public static int TrailingZeros(int N) {
		
		int ans = 0;
		int p =5;
		while (N/p >0) {
			ans = ans + N/p;
			p =p*5;
		}
		return ans;
	}
	public static void main(String[] args) {
		int N=1000;
		System.out.print(TrailingZeros(N));
		
	}
}
