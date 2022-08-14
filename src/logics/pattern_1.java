package logics;

public class pattern_1 
{

	public static void main(String[] args)
	{
		
//		int i,j;
//		for (i=0;i<=5;i++)                     //row
//		{
//			for (j=0;j<=i;j++)                 //column
//			
//				System.out.print("*");	
//			
//			System.out.println();
//		}
		
		// row--6 star--1
		
		int star =1;
		
		for (int i=1;i<=6;i++)
		{
			for(int j=1; j<=star;j++) 
				System.out.print("*");
			
			
			
		}
		star++;
		System.out.println();

	}

}
