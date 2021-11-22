package Test;

import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class PrintPrimeNums {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check prime =");
		int num = sc.nextInt();
		int i=2; int temp=0;
	    while (i <= num){
	        int j=2;
	        while (j < (i-1))
	        {
	            if (i % j == 0){
	                temp = temp +1;
	            }j++;
	        }
	        if (temp == 0){
	            System.out.println(i);
	        }
	        temp = 0;
	        i++;
	    }
	   sc.close();     
	    }
}

