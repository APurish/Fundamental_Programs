package Arrays;
import java.util.*;
import java.lang.*;


public class RemoveDuplicates {

	public static int[] removeDuplicates(int[] nums) {
		int rmv=0;
		int idx =1;
        for(int i=1;i<nums.length;i++)  {
            if(nums[i] != nums[i-1]){
                nums[idx] = nums[i];
                idx++;
                
            }
        }
        return nums;
      }
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Size:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.print("Enter Elements of Array:");
        for(int j=0;j<nums.length;j++) {        	
        	nums[j] = sc.nextInt();
        }
    	int k[] = removeDuplicates(nums);
    	for(int l=0; l<k.length;l++) {
    	System.out.print(k[l]);
    	}
        
    }
}
