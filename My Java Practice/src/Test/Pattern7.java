package Test;

import java.util.Scanner;

public class Pattern7 {
//************* Printing below pattern****************
//	A
//	B B
//	C C C
//	D D D D
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num: ");
	int N = sc.nextInt();
	int val = (int)'A';
	for(int i=1;i<=N;i++) {
	
		for(int j=1; j<=i;j++) {
		System.out.print((char)val);
		if (j != i) {
			System.out.print(" ");
		}
		
		}
		System.out.println();
		val++;
	
	}

}
}
