package Test;

import java.util.Scanner;


public class PrimeNumbersChk {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number to check prime =");
	int num = sc.nextInt();
	int i=2;int temp=0;
	
	while (i <= (num-1)) {
		
		if(num % i == 0) {
			
			temp = temp+1;
			
		}
		i++;
	}
	 if (temp == 0) {
			System.out.print("<<It's a prime no: >>" +num);
	 }
	else
	{
			System.out.print("<<Its not a prime no: >>" +num);
	}
	sc.close();
	}
	
}
