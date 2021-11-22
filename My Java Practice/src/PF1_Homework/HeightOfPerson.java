package PF1_Homework;
import java.lang.*;
import java.util.*;



public class HeightOfPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
		float ht = sc.nextFloat();
        
		if(ht>195) {
        	System.out.print("abnormal");
        	}
        else if(ht>=165 && ht<=195) {
        	System.out.print("taller");
        }
        else if(ht>=150 && ht<165) {
        	System.out.print("average");
        } 
        else {
        	System.out.print("dwarf");
        }
	}

}
