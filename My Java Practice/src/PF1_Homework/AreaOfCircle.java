package PF1_Homework;
import java.lang.*;
import java.util.*;

public class AreaOfCircle {
	    static int solve(int A) {
	    double pi =Math.acos(-1); int area=0;
	      area = (int)Math.abs(Math.ceil(pi*(A*A)));
	      return area;
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Radius: ");
	        int Rad = sc.nextInt();
	        System.out.print(solve(Rad));
	        
	    }
	}



