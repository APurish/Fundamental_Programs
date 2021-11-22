package PF1_Homework;
import java.lang.*;
import java.util.*;

public class MathTables {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num: ");
        int num = sc.nextInt();
        int i=1;int cal;
        for(i=1;i<=10;i++)
        {
            cal = num*i;

        
        System.out.print(+num +" * " +i +" = " +cal);
        System.out.println();
        }
        
    }
}




