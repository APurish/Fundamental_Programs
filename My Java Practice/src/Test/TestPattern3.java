package Test;
// Printing Triangle using while loop
public class TestPattern3 {
	public static void main(String args[]) {
		
		int N=5;
	 	int j=1;int i=1;
		while (j <= N) 					//* Print the space in it's ith Row*/
		{				
			int space = 1;
			while (space <= (N-i))			//*Calculating the spaces */
			{
				System.out.print(" ");
				space = space +1;
			} 
			int star=1;
			while(star <=((2*i)-1))			//*Calculating the Stars */
			{
				System.out.print("*");
				star = star+1;
				
			}i++;
			System.out.println();			//*Print the nextline */
			j =j+1;	
			
			
		}			
		
	
	}
}
