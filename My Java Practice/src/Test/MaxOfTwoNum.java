package Test;
import java.lang.*;
import java.util.*;

public class MaxOfTwoNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first num = ");
		int a = sc.nextInt();
        //Scanner sc1 = new Scanner(System.in);
        //System.out.print("Enter Second num = ");
        int b = sc.nextInt();

        if (a>b){
            System.out.print(a);
        }
        else {
            System.out.print(b);
        }
	}

}
