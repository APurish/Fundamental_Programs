package Test;
import java.lang.*;
import java.util.*;
//*********** Printing the num Pyramid*****************/ 
//Enter a num: 5
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

	public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int N = sc.nextInt();
		for(int i=1;i<=N;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(j);
	            if(j != i){
	                System.out.print(" ");
	            }
	            
	        }
	        System.out.println();
	    }
	        
	    }
}
