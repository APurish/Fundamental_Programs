package PF1_Homework;
import java.lang.*;
import java.util.*;


public class VowelsCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
		char ch = sc.nextLine().charAt(0);
		if (ch == 'a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.print(1);
		}
		else 
			System.out.print(0);
        

	}

}
