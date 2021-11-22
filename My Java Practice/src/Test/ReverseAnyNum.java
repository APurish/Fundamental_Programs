package Test;
import java.lang.*;
import java.util.*;


public class ReverseAnyNum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter test case times: ");
        int T = sc.nextInt();
        for(int i=1;i<=T;i++)
        {	System.out.print("Enter Any num : ");
            int num = sc.nextInt();
            int rem=0;
            while (num != 0)
            {
                
                rem = rem*10+num %10;
                num = num /10;
                
            }System.out.print((rem));
            System.out.println();
        }
        
    }
}
