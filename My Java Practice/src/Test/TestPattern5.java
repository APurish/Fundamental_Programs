package Test;
//Printing Triangle using for loop
import java.util.Scanner;

public class TestPattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number =");
		int num = sc.nextInt();
		int i;int cnt;		
		for( i=1; i<= num ;i++) {  // loop for the no of rows
			
			for (cnt =1; cnt<=(num-i);cnt++) { // Counting spaces
			System.out.print(" ");
			}
			for(cnt= 1; cnt<=((2*i)-1); cnt ++) { // counting stars
			System.out.print("*");
		}
			System.out.println();
	}
	}
	}
