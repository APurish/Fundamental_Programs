package Arrays;
import java.lang.*;
import java.util.*;

public class PrintNegativeNums {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");	        
        int A = sc.nextInt();
        int arr[] = new int[A];
        System.out.print("Enter elements of array:");
        
        for (int i=0; i<arr.length;i++){        	
            arr[i]= sc.nextInt();
            if(arr[i] < 0){
                System.out.print(arr[i] +" ");
            }
            
        }
        
    }
}
