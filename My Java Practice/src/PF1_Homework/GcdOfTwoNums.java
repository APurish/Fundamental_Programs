package PF1_Homework;

import java.lang.*;
import java.util.*;

public class GcdOfTwoNums {

    public int gcd(int A, int B) {
        int ans=0;
        for(int i=1;i<=Math.max(A,B);i++){
            if(A%i == 0 && B%i ==0){
                 ans =i;
                }
            return ans;
        }
		return 0; 
    }
    
    public static void main(String[] args){
        
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a num: ");
        //int A = sc.nextInt();
        //System.out.print("Enter a num: ");
       // int B = sc.nextInt();
        GcdOfTwoNums s = new GcdOfTwoNums();
        System.out.print(s.gcd(4,6));
        
        
    }
}

