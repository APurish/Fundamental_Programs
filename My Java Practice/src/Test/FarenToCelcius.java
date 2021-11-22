package Test;

public class FarenToCelcius {
	// This program will print the result into specific tablular format.
	public static void main(String[] args) {
		int N=6; 
		int F=32;
		 for(int i=1;i<=N;i++) {
		double C = (double) 5*(F-32)/9;
		 System.out.println(F + " F - " + String.format("%.2f",C) + " c");
		 // update F
		 if (i==1) {
			 F= F+8;
		 }
		 else {
			 F=F+10;
		 }
		 }
	}
}
