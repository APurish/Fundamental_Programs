package Test;

public class Test_Array {
/* Below program to Test two thing Array to find MIN & Passing an Anonymous Array to method */
	
	static void printArray(int arr[]){  
		//int min=arr[0];  
		for(int i=0;i<arr.length;i++)  
		 //if(min>arr[i])  
		  //min=arr[i];  
		  
		//System.out.println(min);
			System.out.println(arr[i]);
		 
}
public static void main(String args[])
{
	//int a[]= {3,4,6,8,9};
	//min(a);
	printArray(new int[]{10,22,44,66});
}
}