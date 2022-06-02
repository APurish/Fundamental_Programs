package StringsProblems;
import java.util.*;
import java.lang.*;

public class TrimSpecCharString {
	//public static String solve(String s) {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
	    String s = sc.nextLine();
		  int i=0;
		  int l = s.length();
          while (i<s.length() && s.charAt(i)=='*'){
              i++;
          }
          
          if(i == l){
              System.out.print("");

          }int j= s.length()-1;
          while(j >=0 && s.charAt(j) == '*')
          {
              j--;
          }
         System.out.print(s.substring(i,j+1));
		    
		}
}
//	public static String Printing(String s) {
//		return s;
//	}
		
	
	
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter any String: ");
//    String s = sc.nextLine();
//    solve(s);
//    Printing(s);
//    System.out.print(s);
//}
//}
//*******
//    import java.util.*;
//    import java.lang.*;
//
//    public class Solution {
//        public String solve(String A) {
//            //Scanner sc = new Scanner(System.in);
//            //String A = sc.readline();
//            int i=0;
//            while (i<A.length && A.charAt(i)=='*'){
//                i++;
//            }
//            int j=length-1;
//            if(i>j){
//                System.out.print("");
//
//            }
//            while(j >=0 && A.charAt(j) == '*')
//            {
//                j--;
//            }
//            return A.substring(i,j+1);
//        }
//    }    
//    
//    
//}
//}
