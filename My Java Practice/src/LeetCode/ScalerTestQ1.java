package LeetCode;
import java.util.*;

public class ScalerTestQ1 {
	//public static int solve(int[] A) {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("size is: ");
        int N = sc.nextInt();
         int [] A = new int[N];
         for(int i=0;i<A.length;i++){
             A[i] = sc.nextInt();
	}
        int maxeven=0;
        for(int j=A.length-1; j>0;j--){
            if(A[j]%2==0 && A[j]>maxeven){
                maxeven = A[j];
                break;
            }
           
        }
            int minodd=0;
            for(int k =0; k<A.length;k++){//&& A[k] < A[k]
                if(A[k]%2 !=0 ){
                    minodd = A[k];
                    break;
                }
            }
            System.out.print(maxeven);
            System.out.println();
            System.out.print(minodd);
            //int cal=0;
            //cal = (maxeven - (minadd));
            //return (cal);
            //System.out.print (cal);
        }
}


