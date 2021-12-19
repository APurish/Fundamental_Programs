package PF1_Homework;

public class DecimalToBinary {
	
public static int DecToBin(int N) {
	int p=1;int ans=0;
		while(N > 0){
	    int last_digit = N % 2;	    
	     ans = ans + last_digit * p;
	    p = p * 10;
	    N = N /2;   
		}
		return ans;
}
public static int MagicNo(int N) {
	int p=1;int ans=0;
	while(N > 0){
    int last_digit = N % 2;	    
     ans = ans + last_digit * p;
    p = p * 5;
    N = N /2; 	// It means removing the last bit;    
	}
	return ans;
}
public static void main(String[] args) {
	int N= 12;
	System.out.print(DecToBin(N));
	System.out.println();
	System.out.print(MagicNo(N));
}
}
