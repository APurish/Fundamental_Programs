package PF1_Homework;
import java.lang.*;
import java.util.*;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any binary num: ");
		int Binum = sc.nextInt();
		int Last_digit =0;
		int ans =0;
		int p=1;
		while(Binum > 0){
            int last_digit = Binum % 10;
            ans = ans + last_digit * p;
            p = p * 2;
            Binum = Binum / 10;
        }
        System.out.print(ans);
	}
	
	
	

}
