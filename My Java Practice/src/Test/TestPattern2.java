package Test;

public class TestPattern2
{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n=6; int row=1;
	
	while (row<=n){
		int col=1;
		while (col<=row) {	
	System.out.print("*");
	col++;
	}
	System.out.println();
	row++;
	} }
}
