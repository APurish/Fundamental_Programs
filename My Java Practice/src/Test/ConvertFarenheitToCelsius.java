package Test;

import java.util.Scanner;

public class ConvertFarenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any temperature in Farenheit =");
		int Far = sc.nextInt();
		float valueConvert = (5*(Far-32))/9;
		System.out.print( +valueConvert +"celcius");
		
}
}
