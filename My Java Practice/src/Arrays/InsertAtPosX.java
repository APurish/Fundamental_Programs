package Arrays;
import java.lang.*;
import java.util.*;

public class InsertAtPosX {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter any num: ");	        
	        int N = sc.nextInt();
	        int arr[] = new int[N]; 
	        System.out.print("Enter array nums:"+ " ");
	        for(int i=0;i<arr.length;i++){
	        
	        arr[i] = sc.nextInt();
	        	    }
	        System.out.print("Enter pos:");          
	        int pos = sc.nextInt();
	        System.out.print("Enter element to insert: ");
	        int Y = sc.nextInt();
	        	        for(int j=0;j<arr.length;j++){
	        	            if(j < (pos-1)){
	        	                System.out.print(arr[j]+" ");
	        	            }
	        	            if(j == (pos-1)){
	        	                System.out.print(Y +" ");
	        	            }
	        	            if(j >= (pos-1)){
	        	                System.out.print(arr[j] +" ");
	        	            }

	        	        }
	        	      
	        	}
	        	}