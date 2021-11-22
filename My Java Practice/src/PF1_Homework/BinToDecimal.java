package PF1_Homework;
import java.lang.*;
import java.util.*;

public class BinToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary num: ");
		long num = sc.nextLong();
		long rem, pow = 1, res, bin = 0, div = 1;
		while (num != 0) {
		rem = num % 10;
		if (rem >= 0) {
		res = rem * pow;
		bin = bin + res;
		pow = pow * 2;
		div = num / 10;
		if (div == 0) {
		System.out.println(bin);
		break;
		}
		}
		num = div;
		}

	}

}
