package Test;

public class SumEvenNos {
	public static void main(String[] args) {
		int N=30;int sum=0;
		for (int i=1;i<=N; i++)
		{  
			
			if(i%2 == 0) {
			System.out.print(+i +" ");
			System.out.println();
			sum=sum+i;
			}
			
		}
		System.out.println("Sum of even nos:"+sum);
	}
}
	
