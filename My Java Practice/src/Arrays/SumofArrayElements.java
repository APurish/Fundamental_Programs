package Arrays;
import java.lang.*;
import java.util.*;

public class SumofArrayElements {	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of array: ");	        
	        int A = sc.nextInt();
	        int[] arr = new int[A];
	        int sum=0;
	        //System.out.println();
        	System.out.print("Enter elements of Array: ");
        	
	        for(int i=0; i<arr.length; i++) {
	        	 arr[i] = sc.nextInt();
	        	sum = sum + arr[i];
	        
	    }
	        System.out.print(sum);
	}
}


