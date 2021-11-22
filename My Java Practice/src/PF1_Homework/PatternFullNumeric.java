package PF1_Homework;
import java.lang.*;
import java.util.*;


import java.util.Scanner;

public class PatternFullNumeric {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any num: ");
	int n = sc.nextInt();
	int p=1,i,k,l,x;
	for(i=1;i<=n;i++) {
		for(int spc=1;spc<=n-i; spc++) {
			System.out.print("0 ");
		}
		for(k=i;k<i+p;k++) {
			System.out.print(k+" ");
		}
		for(l=i+p-2;l>=i;l--) {
			System.out.print(l+" ");
		}
		for(x=1; x<=(n-i);x++) {
			System.out.print("0 ");
		}
		p++;
		System.out.println();
		}
	}
}

