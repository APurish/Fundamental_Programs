package Arrays;
import java.util.*;
import java.lang.*;

public class MaxMinOfArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Arr: ");
        int N = sc.nextInt();
        int [] arr = new int[N];
        System.out.print("Enter element Array: ");
        int max=0,min=1001;
        for(int i=0; i < arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int j =0;j<arr.length;j++){
            if(arr[j] > max){
                 max = arr[j];
               
            }
            }
            for(int j =0;j<arr.length;j++){
                if(arr[j] < min){
                 min = arr[j];        
                }
      }System.out.print(max +" "+min);
        
    }
}
