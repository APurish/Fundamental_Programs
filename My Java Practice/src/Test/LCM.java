package Test;

public class LCM {
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
        System.out.println(+g);
        int lcm = (a*b)/g;
        return lcm;
   }
   
     
     public static void main(String[] args) { 
    	 LCM obj = new LCM();
       int val = obj.FindLCM(20,12);
       
       System.out.print(val);
   }

}
