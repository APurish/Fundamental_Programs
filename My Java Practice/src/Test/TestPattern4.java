package Test;

public class TestPattern4 {
	public static void main(String args[]) {
		
		int N=5; 
			{
				int i=1; int j=1;
			while (j <= (2*N-1)) 
			{		/* Print the space in it ith Row*/
				i=j;
				if (i>N) 
				{  i=2*N-i;
				}
				
				int space = 1;
				while (space <= (N-i))			/*Calculating the spaces */
				{
					System.out.print(" ");
					space = space +1;
				} 
				int star=1;
				while(star <=((2*i)-1))			/*Calculating the Stars */
				{
					System.out.print("*");
					star = star+1;
				}	
				System.out.println("");			/*Print the nextline */
				j =j+1;
			}			
			}
		}	
		}

