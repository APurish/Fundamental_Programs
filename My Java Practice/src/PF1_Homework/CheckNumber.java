package PF1_Homework;
import java.lang.*;
import java.util.*;

public class CheckNumber {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter any number: ");
	        int num = sc.nextInt();
	        if(num > 0){
	            System.out.print(1);
	        }
	        else if (num < 0)
	        {
	            System.out.print(-1);
	        }
	        else {
	            System.out.print(0);
	        }
	        
	    }

}
