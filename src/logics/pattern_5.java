package logics;

public class pattern_5 {

	public static void main(String[] args) 
	{
//		int i,j,k,n = 5;
//		for ( i=1;i<=5;i++)
//		{
//			for (j=1;j<=n;j++)
//			{
//			
//				System.out.print(" ");
//			}
//			n--;
//			for ( k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//			}

		
		
		int i,j;
		for (i=1;i<6;i++)                       //row
		{
			for(j=6;j>=i;j--)                   //space
			{
				System.out.print(" ");
			}
			for (j=0;j<(2*i-1);j++)              //column
			{
				System.out.print("*");         
			}
			System.out.println();
		}
		
		System.out.println("===============");
		
		for(int a=1;a<=9;a++)                   //row
		{
			for(int b=(9-a);b>=1;b--)           //space
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)               //column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
