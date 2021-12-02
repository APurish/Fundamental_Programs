package Test;

import java.util.Scanner;

/*This code will work for calculating Electricity bill with below 400 reading*/
public class ElectricityBillCalculator {
	
	public static void main(String[] args) {
		
		double a=0,b=0,c=0,d=0;
		int df1,df2,df3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the units: ");
		int ut = sc.nextInt();
		
		if (ut <=50 ) {
			a = Math.floor((0.50*ut)+(0.50*ut)*0.20);
			System.out.print(a);
			
		}
		 if (ut >50 || ut <= 150) {
			df1=ut-50;
			b = a + (0.75*df1)+(0.75*df1)*0.20;
			System.out.print(b);
			
			}
		else if (ut >150 && ut <=250) {
			df2=ut-150;
			c = a + b + Math.floor((1.20*df2)+(1.20*df2)*0.20);
			System.out.print(c);
			
		}
		else {
			df3 = ut-250;
			d = a + b + c + Math.floor((1.50*df3)+(1.50*df3)*0.20);
			System.out.print(d);
		}		
			
		}
}
		
		
		

