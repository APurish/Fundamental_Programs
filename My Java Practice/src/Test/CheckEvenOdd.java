package Test;

import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number =");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.print(0); // Print 0 in case of even number
		}
		else {
			System.out.print(1); // Print 1 in case odd number
		
		}
	}


}
