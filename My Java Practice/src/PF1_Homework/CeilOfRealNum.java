package PF1_Homework;
import java.lang.*;
import java.util.*;

public class CeilOfRealNum {
    public int solve(int A) {
        if( A > 0){
            int x = (int)Math.round(A/200);
            //System.out.print(x);
          return x; 
      }else { 
          if (A>0 && Math.abs(A)%200 == 0){
              return A/200;
          } 
          else {
        	  System.out.print(A/200 );
        	  System.out.println();
              return A/200;
          }
      }
         }
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter integer :");
          int A = sc.nextInt();
          CeilOfRealNum s = new CeilOfRealNum();
          System.out.print(s.solve(A));
          
      }
}




