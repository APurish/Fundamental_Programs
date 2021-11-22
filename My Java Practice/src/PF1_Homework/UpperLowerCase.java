package PF1_Homework;

import java.lang.*;
import java.util.*;

public class UpperLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Char: ");
		String str = sc.nextLine();
		 int chr;
		for(int i=0; i<=str.length()-1;i++) 
		{		
			chr = str.charAt(i);
//			z=z+c;
			if(chr >=(char)97 && chr<=(char)122) 
			{
			System.out.print("lowercase");
			break;
			}
			else {
				System.out.print("UPPERCASE");
				break;
			}
		}
			
	}
	}
	
