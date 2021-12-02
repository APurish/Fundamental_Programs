package Arrays;
import java.lang.*;
import java.util.*;



public class RemoveNegativeNums {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of array: ");	        
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        int arr1[] = new int[N];
	        int i=0;
	        System.out.print("Enter elements of array:" + " ");
	        
            
	        for(;i<arr.length-1;i++){
	            arr[i] = sc.nextInt();
	            }
	        System.out.print("Enter pos:");
            int pos = sc.nextInt();
            if(arr[i] != pos){
            arr1[i]= arr[i];
            System.out.print(arr1[i]);
	          }
	        
	    }
}
