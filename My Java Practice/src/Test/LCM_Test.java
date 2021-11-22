package Test;
import java.lang.*;
import java.util.*;


public class LCM_Test {
    int g=1;
	public int FindLCM(int a,int b)
    {
        for(int i=1;i<=Math.max(a,b);i++)
        {
        if (a%i==0 && b%i==0)
        {
             g = i;
            } 
        }
       
        int lcm = (a*b)/g;
        return lcm;
   }
      
     public static void main(String[] args) { 
    	 LCM_Test obj = new LCM_Test();
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         System.out.println("Enter first no: ");
         System.out.println("Enter Second no: ");
         int b = sc.nextInt();
       int val = obj.FindLCM(a,b);       
       System.out.print(val);
   }

}