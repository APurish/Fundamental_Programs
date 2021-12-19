package Arrays;
import java.util.*;
import java.lang.*;

public class ConstantArray {
	Scanner sc = new Scanner(System.in);
	public int[] solve(final int[] A, int B) {
        int[]outArr = new int[A.length];
       // int[]outArr1 = new int[A.length];
       for(int i =0; i<A.length;i++){
    	    outArr[i] = A[i] +B; 
       }
       return outArr;
   }
	public static void main(String[] args) {
				
	}
}
