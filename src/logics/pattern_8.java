package logics;

public class pattern_8
{

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++) 
		{
		
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		}
		
		for (int a=5;a>=1;a--)
		{
			for (int b=1;b<=a;b++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
     
	
	
	
}
